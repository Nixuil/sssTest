package com.bzy.service.impl;

import com.bzy.dao.BaseDao;
import com.bzy.entity.User;
import com.bzy.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 **/
@Service("UserService")
public class BaseServiceImpl implements BaseService {
    @Resource(name = "UserDao")
    private BaseDao baseDao;
    @Override
    public boolean selectOneByUser(User user) {
        int i = baseDao.selectOneByUser(user);
        if (i==0) return false;
        else if(i==1) return true;
        else return false;
    }
}

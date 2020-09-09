package com.bzy.service.impl;

import com.bzy.entity.User;
import com.bzy.service.BaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/root-context.xml")
public class BaseServiceImplTest {

    @Resource(name = "UserService")
    private BaseService userService;

    @Test
    public void selectOneByUser() {
        User user = new User();
        user.setUserName("zhangsan");
        user.setPassWord("zs1234");
        boolean b = userService.selectOneByUser(user);

    }
}

package com.bzy.dao;

import com.bzy.entity.User;

public interface BaseDao {
    int selectOneByUser(User user);
}

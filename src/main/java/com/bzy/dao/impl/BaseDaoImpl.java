package com.bzy.dao.impl;

import com.bzy.dao.BaseDao;
import com.bzy.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 **/
@Repository("UserDao")
public class BaseDaoImpl implements BaseDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public BaseDaoImpl() {
    }

    @Override
    public int selectOneByUser(User user) {
        String sql = "select * from user where username = ? and password = ?";
        List<User> query = jdbcTemplate.query(sql, new Object[]{user.getUserName(), user.getPassWord()}, new BeanPropertyRowMapper<>(User.class));
        System.out.println(query);
        return query.size();
    }
}

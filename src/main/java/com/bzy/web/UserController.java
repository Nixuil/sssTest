package com.bzy.web;

import com.bzy.entity.User;
import com.bzy.service.BaseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *
 **/
@Controller
public class UserController {
    @Resource(name = "UserService")
    private BaseService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String loginCheck(@RequestParam String userName,@RequestParam String password){
        User user = new User();
        user.setUserName(userName);
        user.setPassWord(password);
        boolean b = userService.selectOneByUser(user);
        if (b){
            return "ok";
        }else {
            return "error";
        }
    }
}

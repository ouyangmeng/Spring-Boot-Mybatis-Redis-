package com.ouym.demo.controller;

import com.ouym.demo.model.User;
import com.ouym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 19:25 2018/9/19
 * @Modified By:
 */
@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    String home() {
        User user = userService.getById(16);
        String username = null;
        if (user != null) {
            username = user.getUsername();
        }
        return "hello " + username;
    }


}

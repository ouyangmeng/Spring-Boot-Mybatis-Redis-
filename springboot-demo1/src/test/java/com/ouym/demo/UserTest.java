package com.ouym.demo;

import com.ouym.demo.dao.UserMapper;
import com.ouym.demo.model.User;
import com.ouym.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 20:44 2018/9/21
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void getByIdTest(){

        User user = userService.getById(16);
        System.out.println(user.getUsername());
    }
}

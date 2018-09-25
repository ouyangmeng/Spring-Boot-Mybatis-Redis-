package com.ouym.demo.service.impl;

import com.ouym.demo.dao.UserMapper;
import com.ouym.demo.model.User;
import com.ouym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 19:41 2018/9/21
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Cacheable(value="getById",key="1")
    public User getById(Integer userId) {
        System.out.println("打印语句则没有走缓存");
        return userMapper.getById(userId);
    }
}

package com.ouym.demo.dao;

import com.ouym.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 19:40 2018/9/21
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    User getById(Integer userId);

}

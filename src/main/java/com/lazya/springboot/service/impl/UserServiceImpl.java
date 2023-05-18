package com.lazya.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lazya.springboot.mapper.UserMapper;
import com.lazya.springboot.pojo.User;
import com.lazya.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Title: UserServiceImpl
 * Description:
 *
 * @author 懒闲人(ldg)
 * @version 1.0
 * @date 2023 05 18 10 10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

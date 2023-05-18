package com.lazya.springboot.controller;

import com.lazya.springboot.common.Result;
import com.lazya.springboot.pojo.User;
import com.lazya.springboot.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Title: UserController
 * Description:
 *
 * @author 懒闲人(ldg)
 * @version 1.0
 * @date 2023 05 18 10 08
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping
    public Result list() {
        List<User> userList = userService.list();
        return Result.success(userList);
    }


}

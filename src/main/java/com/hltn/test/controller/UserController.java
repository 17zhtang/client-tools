package com.hltn.test.controller;

import com.hltn.test.common.result.Result;
import com.hltn.test.entity.User;
import com.hltn.test.service.UserService;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Result saveUser(@RequestBody User user){
        return null;
    }

    @GetMapping("delete/{id}")
    public Result deleteUser(@PathVariable int id){
        return null;
    }

    @PostMapping("/update")
    public Result updateUser(@RequestBody User user){
        boolean flag = userService.updateById(user);
        return Result.ok();
    }

    @GetMapping("get/{id}")
    public Result getUser(@PathVariable int id){
        User user = userService.getById(id);
        return Result.ok(user);
    }
}

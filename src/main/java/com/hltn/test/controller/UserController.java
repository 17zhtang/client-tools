package com.hltn.test.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags="用户管理")
@RestController
@RequestMapping("/User")
public class UserController {
    @GetMapping("/{id}")
    public Long Test(@PathVariable Long id) {
        return id;
    }

}

package com.hltn.test.controller;

import com.hltn.test.common.result.Result;
import com.hltn.test.dto.resp.GetUerInfoRespDto;
import com.hltn.test.entity.UserGroup;
import com.hltn.test.entity.User;
import com.hltn.test.service.UserGroupService;
import com.hltn.test.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserGroupService userGroupService;

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
    public Result getUserInfo(@PathVariable int id){
        GetUerInfoRespDto getUerInfoRespDto = new GetUerInfoRespDto();
        User user = userService.getById(id);
        UserGroup group = userGroupService.getById(user.getGroupId());
        getUerInfoRespDto.setId(user.getId());
        getUerInfoRespDto.setAccount(user.getAccount());
        getUerInfoRespDto.setName(user.getName());
        getUerInfoRespDto.setGroupName(group.getGroupName());
        return Result.ok(getUerInfoRespDto);
    }
}

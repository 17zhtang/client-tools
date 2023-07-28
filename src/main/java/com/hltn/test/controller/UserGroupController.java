package com.hltn.test.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hltn.test.common.result.Result;
import com.hltn.test.dto.req.GetUserGroupsReqDto;
import com.hltn.test.entity.UserGroup;
import com.hltn.test.service.UserGroupService;
import com.hltn.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userGroup")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @PostMapping("/page")
    public Result getUserGroups(@RequestBody GetUserGroupsReqDto dto){
        Page<UserGroup> page = userGroupService.getUserGroups(dto);
        return Result.ok(page);
    }
}

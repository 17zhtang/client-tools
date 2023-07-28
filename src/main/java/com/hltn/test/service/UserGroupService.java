package com.hltn.test.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hltn.test.dto.req.GetUserGroupsReqDto;
import com.hltn.test.entity.UserGroup;

public interface UserGroupService extends IService<UserGroup> {
    public Page<UserGroup> getUserGroups(GetUserGroupsReqDto dto);
}

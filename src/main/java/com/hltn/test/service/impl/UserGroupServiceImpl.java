package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.dto.req.GetUserGroupsReqDto;
import com.hltn.test.entity.UserGroup;
import com.hltn.test.mapper.GroupMapper;
import com.hltn.test.service.UserGroupService;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl extends ServiceImpl<GroupMapper, UserGroup> implements UserGroupService {

    @Override
    public Page<UserGroup> getUserGroups(GetUserGroupsReqDto dto) {
        Page<UserGroup> pageParam = new Page<>();
        LambdaQueryWrapper<UserGroup> wrapper = new LambdaQueryWrapper<>();
        if(StringUtils.isNotBlank(dto.getGroupName())){
            wrapper.like(UserGroup::getGroupName,dto.getGroupName());
        }
        Page<UserGroup> page = baseMapper.selectPage(pageParam,wrapper);
        
        return page;
    }
}

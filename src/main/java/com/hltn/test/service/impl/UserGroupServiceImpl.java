package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.entity.UserGroup;
import com.hltn.test.mapper.GroupMapper;
import com.hltn.test.service.UserGroupService;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl extends ServiceImpl<GroupMapper, UserGroup> implements UserGroupService {

}

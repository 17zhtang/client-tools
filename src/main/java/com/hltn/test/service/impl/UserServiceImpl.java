package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.entity.User;
import com.hltn.test.mapper.UserMapper;
import com.hltn.test.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {

}

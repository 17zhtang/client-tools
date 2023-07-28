package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.dto.req.GetTestAccountReqDto;
import com.hltn.test.entity.TestAccount;
import com.hltn.test.mapper.TestAccountMapper;
import com.hltn.test.service.TestAccountService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestAccountServiceImpl extends ServiceImpl<TestAccountMapper, TestAccount> implements TestAccountService {
    @Override
    public IPage<TestAccount> getTestAccounts(GetTestAccountReqDto dto) {
        Page<TestAccount> pageParam = new Page<>(dto.getCurrentPage(),dto.getPageSize());
        LambdaQueryWrapper<TestAccount> wrapper = new LambdaQueryWrapper<>();

        String account = dto.getAccount();
        String comments = dto.getComments();
        String env = dto.getEnvironment();
        String type = dto.getType();
        if(!StringUtils.isEmpty(account)){
            wrapper.like(TestAccount::getAccount,account);
        }
        if(!StringUtils.isEmpty(comments)){
            wrapper.like(TestAccount::getComments,comments);
        }
        if(!StringUtils.isEmpty(env)){
            wrapper.like(TestAccount::getEnvironment,env);
        }
        if(!StringUtils.isEmpty(type)){
            wrapper.like(TestAccount::getType,type);
        }
        return baseMapper.selectPage(pageParam,wrapper);
    }
}

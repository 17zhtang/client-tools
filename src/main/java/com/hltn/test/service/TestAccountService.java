package com.hltn.test.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hltn.test.dto.req.GetTestAccountReqDto;
import com.hltn.test.entity.TestAccount;

public interface TestAccountService extends IService<TestAccount> {
    IPage<TestAccount> getTestAccounts(GetTestAccountReqDto dto);
}

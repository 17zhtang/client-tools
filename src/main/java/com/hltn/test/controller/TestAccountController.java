package com.hltn.test.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hltn.test.common.result.Result;
import com.hltn.test.dto.req.GetTestAccountReqDto;
import com.hltn.test.entity.TestAccount;
import com.hltn.test.service.TestAccountService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/testAccount")
public class TestAccountController {

    @Autowired
    TestAccountService testAccountService;

    @ApiOperation("测试账号条件分页查询")
    @PostMapping(value = "/page")
    public Result getTestAccounts(@RequestBody @Valid GetTestAccountReqDto dto){
        IPage<TestAccount> page = testAccountService.getTestAccounts(dto);
        return Result.ok(page);
    }
}

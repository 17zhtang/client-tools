package com.hltn.test.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class TestAccount extends BaseEntity {

    @ApiModelProperty(value = "账号类型")
    private String type;

    @ApiModelProperty(value = "环境")
    private String environment;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value="密码")
    private String password;

    @ApiModelProperty(value = "验证码")
    private String verificationCode;

    @ApiModelProperty(value = "备注")
    private String comments;


}

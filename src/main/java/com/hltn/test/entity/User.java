package com.hltn.test.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "部门ID")
    private int DepartmentId;




}

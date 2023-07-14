package com.hltn.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户")
@TableName("user")
public class User extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @TableField("account")
    @ApiModelProperty(value = "账号")
    private String account;

    @TableField("name")
    @ApiModelProperty(value = "用户名")
    private String name;

    @TableField("group_id")
    @ApiModelProperty(value = "部门ID")
    private int GroupId;

    @TableField("password")
    @ApiModelProperty(value = "密码")
    private String password;


}

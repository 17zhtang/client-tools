package com.hltn.test.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Device extends BaseEntity {

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "系统类型")
    private String systemType;

    @ApiModelProperty(value = "系统版本")
    private String systemVersion;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "拥有者ID")
    private int ownerId;

    @ApiModelProperty(value = "当前使用者")
    private String username;
}

package com.hltn.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Device extends BaseEntity {

    @ApiModelProperty(value = "型号")
    @TableField("model")
    private String model;

    @ApiModelProperty(value = "系统类型")
    @TableField("system_type")
    private int systemType;

    @ApiModelProperty(value = "系统版本")
    @TableField("system_version")
    private String systemVersion;

    @ApiModelProperty(value = "品牌")
    @TableField("brand")
    private String brand;

    @ApiModelProperty(value = "拥有者ID")
    @TableField("owner_id")
    private int ownerId;

    @ApiModelProperty(value = "当前使用者")
    @TableField("current_user")
    private String current_user;

    @ApiModelProperty(value = "设备状态")
    @TableField("state")
    private int state;

    @ApiModelProperty(value = "备注")
    @TableField("comments")
    private String comments;
}

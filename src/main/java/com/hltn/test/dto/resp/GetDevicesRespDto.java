package com.hltn.test.dto.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GetDevicesRespDto {

    @ApiModelProperty(value = "设备id")
    private Long deviceId;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "系统类型")
    private String systemType;

    @ApiModelProperty(value = "系统版本")
    private String systemVersion;

    @ApiModelProperty(value = "拥有者id")
    private Long ownerId;

    @ApiModelProperty(value = "拥有者姓名")
    private String ownerName;

    @ApiModelProperty(value = "当前使用者")
    private String currentUser;

    @ApiModelProperty(value = "设备状态")
    private String state;

    @ApiModelProperty(value = "备注")
    private String comments;

    @ApiModelProperty(value = "所在组id")
    private Long userGroupId;

    @ApiModelProperty(value = "所在组名")
    private String groupName;
}

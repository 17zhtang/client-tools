package com.hltn.test.dto.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GetDevicesReqDto {
    @ApiModelProperty(value = "拥有者ID")
    private Long ownerId;

    @ApiModelProperty(value = "拥有者所在组ID")
    private Long userGroupId;

    @ApiModelProperty(value = "型号")
    private String model;

    @ApiModelProperty(value = "品牌")
    private String brand;

    @ApiModelProperty(value = "系统类型")
    private int systemType;

    @ApiModelProperty(value = "系统版本")
    private String systemVersion;

    @ApiModelProperty(value = "设备状态")
    private int state;

    @ApiModelProperty(value = "页数")
    private int currentPage;

    @ApiModelProperty(value = "每页数量")
    private int pageSize;
}

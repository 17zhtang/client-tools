package com.hltn.test.dto.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GetUerInfoRespDto {

    @ApiModelProperty(value = "用户id")
    private Long id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "用户所在的组名")
    private String groupName;

}

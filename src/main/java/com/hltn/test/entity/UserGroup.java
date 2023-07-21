package com.hltn.test.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserGroup extends BaseEntity{

    @ApiModelProperty(value = "组名")
    private String groupName;

}

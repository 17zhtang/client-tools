package com.hltn.test.dto.req;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class GetTestAccountReqDto {

    @ApiModelProperty(value = "环境",required = true)
    @NotNull(message = "环境不能为空")
    @NotBlank
    private String environment;


    @ApiModelProperty(value = "账号类型")
    private String Type;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "备注")
    private String comments;


    private Integer currentPage;


    private Integer pageSize;
}

package com.hltn.test.common.result;

import lombok.Getter;

@Getter
public enum ResultEnum {
    SUCCESS(200, "成功"),
    FAIL(201,"失败");


    private Integer code;
    private String message;

    private ResultEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}

package com.hltn.test.common.result;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    private Result(){}

    public static<T> Result<T> build(T body, ResultEnum resultEnum){
        Result<T> result = new Result<>();
        if(body !=null){
            result.setData(body);
        }
        result.setCode(resultEnum.getCode());
        result.setMessage(resultEnum.getMessage());
        return result;
    }

    //成功
    public static<T> Result<T> ok(){
        return build(null,ResultEnum.SUCCESS);
    }

    public static<T> Result<T> ok(T data){
        return build(data,ResultEnum.SUCCESS);
    }

    //失败
    public static<T> Result<T> fail(){
        return build(null,ResultEnum.FAIL);
    }

    public static<T> Result<T> fail(T data){
        return build(data,ResultEnum.FAIL);
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}

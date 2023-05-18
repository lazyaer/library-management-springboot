package com.lazya.springboot.common;

import com.lazya.springboot.constants.ResultCode;
import lombok.Data;

/**
 * Title: Result
 * Description:
 *
 * @author 懒闲人(ldg)
 * @version 1.0
 * @date 2023 05 18 11 44
 */
@Data
public class Result {
    private String code;
    private Object data;
    private String msg;

    public static Result success(){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS_CODE);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ResultCode.ERROR_CODE);
        result.setMsg(msg);
        return result;
    }
}

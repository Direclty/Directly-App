package com.directly.luckyboard.core.bean;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:14
 */

public class BaseResponse<T> {

    public static final int SUCCESS = 0;

    public static final int FAIL = 1;
    //zhouxiaolong modify for add network response state 2019-08-26 begin
    /**
     * 返回是否成功
     */
    public String success;
    //zhouxiaolong modify for add network response state 2019-08-26 end

    /**
     * 状态码
     */
    public int errorCode;

    /**
     * 返回码
     */
    public String errorMessage;

    /**
     * 返回信息
     */
    public T data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //zhouxiaolong modify for add network response state 2019-08-26 begin
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    //zhouxiaolong modify for add network response state 2019-08-26 end
}

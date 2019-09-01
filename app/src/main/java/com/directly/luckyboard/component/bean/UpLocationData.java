package com.directly.luckyboard.component.bean;

/**
 * @author Xiao-Long Zhou
 * @date 2019-08-27
 */
public class UpLocationData {
    private boolean success;
    private String status;
    private String msg;
    private String obj;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public String getObj() {
        return obj;
    }
}

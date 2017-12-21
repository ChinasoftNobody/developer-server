package com.lgh.chinasoft.developer.common;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class Response<T> implements Serializable{
    private boolean success;

    private String message;

    private T result;

    public Response() {
        this(false,"server error",null);
    }

    public Response(String message) {
        this(false,message,null);
    }

    public Response(T result) {
        this(true,null,result);
    }

    public Response(boolean success, String message) {
        this(success,message,null);
    }

    public Response(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

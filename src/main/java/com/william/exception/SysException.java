package com.william.exception;

public class SysException extends Exception{

    private String exceptionMsg;

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    /**
     * 有参构造，new对象时必须带有参数
     * @param exceptionMsg
     */
    public SysException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}

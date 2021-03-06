package com.fanxuankai.boot.mqbroker.enums;

/**
 * @author fanxuankai
 */
public enum Status {
    /**
     * 已创建
     */
    CREATED(0),
    /**
     * 运行中
     */
    RUNNING(1),
    /**
     * 成功
     */
    SUCCESS(2),
    /**
     * 失败
     */
    FAILURE(3),
    ;
    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

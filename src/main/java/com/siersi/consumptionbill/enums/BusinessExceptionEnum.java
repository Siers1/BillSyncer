package com.siersi.consumptionbill.enums;

import lombok.Getter;

/**
 * 业务异常枚举
 * 定义系统中常见的业务异常类型，包含错误码和错误信息
 * 主要用于用户认证相关的异常处理
 * 
 * @author siersi
 * @version 1.0
 */
@Getter
public enum BusinessExceptionEnum {
    
    /**
     * 账号未注册异常
     */
    UN_REGISTERED(400, "账号未注册"),
    
    /**
     * 账号已被注册异常
     */
    REGISTERED(400, "账号已被注册"),
    
    /**
     * 账号已被封禁异常
     */
    UN_VALID(403, "账号已被封禁"),
    
    /**
     * 账号或密码错误异常
     */
    PASSWORD_WRONG(400, "账号或密码错误");

    /**
     * 错误码
     */
    private final int code;
    
    /**
     * 错误信息
     */
    private final String message;

    /**
     * 构造方法
     * 
     * @param code 错误码
     * @param message 错误信息
     */
    BusinessExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

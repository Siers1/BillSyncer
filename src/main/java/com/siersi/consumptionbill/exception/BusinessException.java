package com.siersi.consumptionbill.exception;

import com.siersi.consumptionbill.enums.BusinessExceptionEnum;
import lombok.Data;

/**
 * 业务异常类
 * 用于封装业务逻辑中的异常情况，包含错误码和错误信息
 * 继承自RuntimeException，可以携带自定义的错误码
 * 
 * @author siersi
 * @version 1.0
 */
@Data
public class BusinessException extends RuntimeException {
    
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 构造方法，使用默认错误码500
     * 
     * @param message 错误信息
     */
    public BusinessException(String message) {
        super(message);
        this.code = 500;
    }

    /**
     * 构造方法，自定义错误码和错误信息
     * 
     * @param code 错误码
     * @param message 错误信息
     */
    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * 构造方法，使用业务异常枚举
     * 
     * @param businessExceptionEnum 业务异常枚举，包含错误码和错误信息
     */
    public BusinessException(BusinessExceptionEnum businessExceptionEnum) {
        super(businessExceptionEnum.getMessage());
        this.code = businessExceptionEnum.getCode();
    }
}

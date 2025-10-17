package com.siersi.consumptionbill.exception;

import com.siersi.consumptionbill.utils.Result;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 全局异常处理器
 * 使用@RestControllerAdvice注解，统一处理应用中抛出的各种异常
 * 将异常转换为统一的响应格式，提供友好的错误信息
 * 
 * @author siersi
 * @version 1.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    /**
     * 处理业务异常
     * 
     * @param e 业务异常对象
     * @return 包含错误码和错误信息的响应结果
     */
    @ExceptionHandler(BusinessException.class)
    public Result<Void> serviceException(BusinessException e) {
        return Result.failure(e.getCode(), e.getMessage());
    }

    /**
     * 处理JSON解析异常
     * 当请求体中的JSON格式不正确时触发
     * 
     * @param e JSON解析异常对象
     * @return 参数格式错误的响应结果
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result<Void> handleJsonParseError(HttpMessageNotReadableException e) {
        return Result.failure(400, "参数格式错误");
    }

    /**
     * 处理参数验证异常
     * 当使用@Valid注解验证请求参数失败时触发
     * 
     * @param e 参数验证异常对象
     * @return 包含具体验证错误信息的响应结果
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<Void> methodArgumentConversionNotSupportedException(MethodArgumentNotValidException e) {
        // 获取第一个验证失败的错误信息
        String errorMessage = e.getBindingResult().getAllErrors().stream()
                .findFirst()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .orElse("参数验证失败");
        return Result.failure(400, errorMessage);
    }

    /**
     * 处理404异常
     * 当请求的接口路径不存在时触发
     * 
     * @param e 404异常对象
     * @return 接口不存在的响应结果
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<Void> handleNoHandlerFoundException(NoHandlerFoundException e) {
        return Result.failure(404, "请求的接口不存在");
    }

    /**
     * 处理HTTP方法不支持异常
     * 当使用不支持的HTTP方法访问接口时触发
     * 
     * @param e HTTP方法不支持异常对象
     * @return 方法不支持的响应结果
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result<Void> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return Result.failure(405, "不支持的请求方法");
    }

    /**
     * 处理其他未知异常
     * 兜底异常处理，处理所有未被特定异常处理器捕获的异常
     * 
     * @param e 通用异常对象
     * @return 服务器内部错误的响应结果
     */
    @ExceptionHandler(Exception.class)
    public Result<Void> handleRuntimeException(Exception e) {
        return Result.failure(500, e.getMessage());
    }
}

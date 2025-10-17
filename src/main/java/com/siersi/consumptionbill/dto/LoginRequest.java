package com.siersi.consumptionbill.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 登录请求数据传输对象
 * 用于封装用户登录时提交的账号和密码信息
 * 同时用于用户注册时的数据传输
 * 
 * @author siersi
 * @version 1.0
 */
@Data
public class LoginRequest {
    
    /**
     * 用户账号，不能为空
     */
    @NotBlank(message = "账号不能为空")
    private String account;

    /**
     * 用户密码，不能为空
     */
    @NotBlank(message = "密码不能为空")
    private String password;
}

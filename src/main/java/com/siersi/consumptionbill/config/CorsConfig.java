package com.siersi.consumptionbill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域资源共享(CORS)配置类
 * 用于解决前后端分离项目中的跨域访问问题
 * 允许前端应用从不同域名访问后端API接口
 * 
 * @author siersi
 * @version 1.0
 */
@Configuration
public class CorsConfig {

    /**
     * 创建并配置CORS过滤器
     * 设置跨域访问的相关规则，包括允许的源地址、请求头和请求方法
     * 
     * @return CorsFilter 配置好的CORS过滤器
     */
    @Bean
    public CorsFilter corsFilter(){
        // 创建基于URL的CORS配置源
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        
        // 创建CORS配置对象
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");   // 允许所有源地址访问
        config.addAllowedHeader("*");   // 允许所有请求头
        config.addAllowedMethod("*");   // 允许所有请求方法（GET、POST、PUT、DELETE等）
        
        // 为所有接口路径注册CORS配置
        source.registerCorsConfiguration("/**", config);
        
        // 返回配置好的CORS过滤器
        return new CorsFilter(source);
    }
}

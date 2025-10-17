package com.siersi.consumptionbill.vo;

import lombok.Data;

import java.util.Date;

/**
 * 用户视图对象
 * 用于向前端返回用户信息，不包含敏感数据如密码
 * 主要用于用户详情展示
 * 
 * @author siersi
 * @version 1.0
 */
@Data
public class UserVo {
    
    /**
     * 用户ID
     */
    private Long id;
    
    /**
     * 用户账号
     */
    private String account;
    
    /**
     * 用户名
     */
    private String username;
    
    /**
     * 用户头像URL
     */
    private String avatar;

    /**
     * 用户角色
     */
    private Integer roleId;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 更新时间
     */
    private Date updateTime;
}

package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * 对应数据库中的user表，用于存储用户基本信息
 * 
 * @author siersi
 * @version 1.0
 */
@Data
@Table(value = "user")
public class User implements Serializable {

    /**
     * 用户ID，主键，自增
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 用户账号，用于登录
     */
    private String account;

    /**
     * 用户密码，加密存储
     */
    private String password;

    /**
     * 用户名，显示名称
     */
    private String username;

    /**
     * 用户头像URL
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 有效性标志，0-无效，1-有效
     */
    private Integer valid;
}

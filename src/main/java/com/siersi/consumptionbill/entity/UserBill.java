package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户账单关联实体类
 * 对应数据库中的user_bill表，用于存储用户与账单的关联关系
 * 实现账单的多用户共享功能，记录用户在账单中的角色
 * 
 * @author siersi
 * @version 1.0
 */
@Data
@Table(value = "user_bill")
public class UserBill implements Serializable {

    /**
     * 关联关系ID，主键，自增
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 账单ID，外键关联bill表
     */
    private Long billId;

    /**
     * 用户ID，外键关联user表
     */
    private Long userId;

    /**
     * 用户在账单中的角色ID
     * 可能的值：1-创建者/管理员，2-普通成员等
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

    /**
     * 有效性标志，0-无效，1-有效
     */
    private Integer valid;

}

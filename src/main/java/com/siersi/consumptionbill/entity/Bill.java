package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 账单实体类
 * 对应数据库中的bill表，用于存储账单基本信息
 * 一个账单可以包含多个消费记录，并可以被多个用户共享
 * 
 * @author siersi
 * @version 1.0
 */
@Data
@Table(value = "bill")
public class Bill implements Serializable {

    /**
     * 账单ID，主键，自增
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 账单名称
     */
    private String billName;

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

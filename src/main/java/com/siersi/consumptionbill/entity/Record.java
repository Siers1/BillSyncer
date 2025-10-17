package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 消费记录实体类
 * 对应数据库中的record表，用于存储具体的消费记录信息
 * 每条记录隶属于某个账单，由某个用户创建
 * 
 * @author siersi
 * @version 1.0
 */
@Data
@Table(value = "record")
public class Record implements Serializable {

    /**
     * 记录ID，主键，自增
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 所属账单ID，关联bill表
     */
    private Long billId;

    /**
     * 创建者ID，关联user表
     */
    private Long creatorId;

    /**
     * 消费项目名称
     */
    private String itemName;

    /**
     * 消费金额
     */
    private BigDecimal itemPrice;

    /**
     * 消费类型（如：餐饮、交通、娱乐等）
     */
    private String consumptionType;

    /**
     * 支付方式（如：现金、支付宝、微信等）
     */
    private String paymentMethod;

    /**
     * 消费日期
     */
    private Date consumptionDate;

    /**
     * 备注信息
     */
    private String comment;

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

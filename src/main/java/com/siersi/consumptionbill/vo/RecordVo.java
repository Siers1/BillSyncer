package com.siersi.consumptionbill.vo;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 消费记录视图对象
 * 用于向前端返回消费记录的详细信息
 * 主要用于消费记录列表展示和详情查看
 * 
 * @author siersi
 * @version 1.0
 */
@Data
public class RecordVo implements Serializable {
    
    /**
     * 记录ID
     */
    private Long id;
    
    /**
     * 所属账单ID
     */
    private Long billId;
    
    /**
     * 创建者ID
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
     * 消费类型
     */
    private String consumptionType;
    
    /**
     * 支付方式
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

//    private Date updateTime;
//    private Integer valid;
}


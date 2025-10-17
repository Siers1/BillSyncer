package com.siersi.consumptionbill.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 添加消费记录请求数据传输对象
 * 用于封装向账单添加消费记录时提交的详细信息
 * 包含消费项目、金额、类型、支付方式等完整信息
 * 
 * @author siersi
 * @version 1.0
 */
@Data
public class AddRecordRequest {
    
    /**
     * 账单ID，指定要添加记录的账单，不能为空
     */
    @NotNull(message = "账本id不能为空")
    private Long billId;

    /**
     * 添加者ID，不能为空
     */
    @NotNull(message = "添加者id不能为空")
    private Long creatorId;

    /**
     * 消费项目名称，不能为空
     */
    @NotBlank(message = "商品名称不能为空")
    private String itemName;

    /**
     * 消费金额，不能为空且必须大于0
     */
    @NotNull(message = "商品价格不能为空")
    @DecimalMin(value = "0.0", message = "商品价格必须大于0")
    private BigDecimal itemPrice;

    /**
     * 消费类型（如：餐饮、交通、娱乐等），不能为空
     */
    @NotBlank(message = "消费类型不能为空")
    private String consumptionType;

    /**
     * 支付方式（如：现金、支付宝、微信等），不能为空
     */
    @NotBlank(message = "支付方式不能为空")
    private String paymentMethod;

    /**
     * 消费日期时间，不能为空
     */
    @NotNull(message = "消费时间不能为空")
    private Date consumptionDate;

    /**
     * 备注信息，可选
     */
    private String comment;
}

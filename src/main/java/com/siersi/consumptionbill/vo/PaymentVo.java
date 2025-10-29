package com.siersi.consumptionbill.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentVo {
    private String type;

    private BigDecimal proportion;
}

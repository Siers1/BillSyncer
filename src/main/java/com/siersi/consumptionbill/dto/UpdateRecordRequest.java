package com.siersi.consumptionbill.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UpdateRecordRequest {
    private Long id;

    private String itemName;

    private BigDecimal itemPrice;

    private String consumptionType;

    private String paymentMethod;

    private Date consumptionDate;

    private String comment;

    private Integer valid;
}

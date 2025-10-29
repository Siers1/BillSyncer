package com.siersi.consumptionbill.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class StatisticsVo {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "0.00")
    private String total;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time;
}

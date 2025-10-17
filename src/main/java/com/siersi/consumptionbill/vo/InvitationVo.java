package com.siersi.consumptionbill.vo;

import lombok.Data;

import java.util.Date;

@Data
public class InvitationVo {
    private Long id;
    private Long billId;
    private Long inviterId;
    private Long inviteeId;
    private Integer status;
    private Date createTime;
}

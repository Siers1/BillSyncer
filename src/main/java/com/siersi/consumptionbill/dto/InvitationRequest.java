package com.siersi.consumptionbill.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class InvitationRequest {

    @NotNull(message = "账本不能为空")
    private Long billId;

    @NotNull(message = "邀请人不能为空")
    private Long inviterId;

    @NotNull(message = "被邀请人不能为空")
    private Long inviteeId;
}

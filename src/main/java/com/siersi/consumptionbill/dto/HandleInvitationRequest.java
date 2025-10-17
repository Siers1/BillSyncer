package com.siersi.consumptionbill.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HandleInvitationRequest {
    @NotNull(message = "邀请不能为空")
    private Long invitationId;

    @NotNull(message = "操作不能为空")
    private Integer optionCode;
}

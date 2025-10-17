package com.siersi.consumptionbill.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserBillDTO {
    @NotNull(message = "用户不能为空")
    private Long userId;

    @NotNull(message = "账本不能为空")
    private Long billId;
}

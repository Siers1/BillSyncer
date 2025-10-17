package com.siersi.consumptionbill.enums;

import lombok.Getter;

@Getter
public enum InvitationStatus {
    PENDING(0),
    APPROVED(1),
    REJECTED(2),
    EXPIRED(3);

    private final Integer Status;

    InvitationStatus(int Status) {
        this.Status = Status;
    }
}

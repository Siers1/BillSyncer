package com.siersi.consumptionbill.dto.AI;

import lombok.Data;

import java.util.List;

@Data
public class AIRequest {
    private List<AIMessage> messageList;

    private Long billId;
}

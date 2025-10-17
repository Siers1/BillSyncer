package com.siersi.consumptionbill.dto.AI;

import lombok.Data;

import java.util.List;

@Data
public class AINetRequest {
    private String model;
    private Boolean stream;
    private List<AIMessage> messages;
}

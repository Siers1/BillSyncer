package com.siersi.consumptionbill.service.AI;

import com.siersi.consumptionbill.dto.AI.AINetMessage;
import com.siersi.consumptionbill.dto.AI.AINetRequest;
import com.siersi.consumptionbill.dto.AI.AIRequest;
import reactor.core.publisher.Flux;

public interface AIService {
    Flux<AINetMessage> analyze(AIRequest request);
    AINetRequest getAINetRequest(AIRequest request);
}

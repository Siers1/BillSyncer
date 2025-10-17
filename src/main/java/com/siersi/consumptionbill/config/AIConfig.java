package com.siersi.consumptionbill.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AIConfig {
    @Value("${Siliconflow.api.qwen.key}")
    private String apiKey;

    @Value("${Siliconflow.api.qwen.url}")
    private String apiUrl;

    @Value("${Siliconflow.api.qwen.model}")
    private String model;
}

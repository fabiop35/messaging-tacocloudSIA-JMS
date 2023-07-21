package com.sia.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.sia.entities.TacoOrder;
import com.sia.services.OrderMessagingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;

@Slf4j
@Primary
@Service
public class KafkaOrderMessagingServiceImpl
        implements OrderMessagingService {

    private KafkaTemplate<String, TacoOrder> kafkaTemplate;

    @Autowired
    public KafkaOrderMessagingServiceImpl(
            KafkaTemplate<String, TacoOrder> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendOrder(TacoOrder order) {
        log.info("[[[ Kafka.sendOrder ]]]");
        kafkaTemplate.send("tacocloud.orders.topic", order);
    }

}

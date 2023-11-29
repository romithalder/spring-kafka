package com.KafkaUpskilling.Springkafka.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "KafkaUpskilling", groupId = "myGroup")
    public void consume(com.KafkaUpskilling.Springkafka.payload.User user){
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
    }
}

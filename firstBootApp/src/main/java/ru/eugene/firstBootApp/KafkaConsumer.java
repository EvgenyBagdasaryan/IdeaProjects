package ru.eugene.firstBootApp;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    /*@KafkaListener(topics = "newTopic", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println("Received message: " + record.value());
        // Обработка полученного сообщения
    }*/
}
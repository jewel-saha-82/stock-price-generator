package org.sm.price.scheduled.kafka;

import org.sm.price.scheduled.model.RealtimePrice;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private final String topic = "generate-stock-price";

	@KafkaListener(topics = topic, groupId = "group-1")
	public void consumeMessage(RealtimePrice realtimePrice) {
		System.out.println("Consumed message: " + realtimePrice);
	}

	@KafkaListener(topics = topic, groupId = "group-2")
	public void consumeMessage1(RealtimePrice realtimePrice) {
		System.out.println("Consumed message: " + realtimePrice);
	}
}

package org.sm.price.scheduled.kafka;

import org.sm.price.scheduled.model.RealtimePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private final String topic = "generate-stock-price";

	@Autowired
	private KafkaTemplate<String, RealtimePrice> kt;

	public void sendMessage(final RealtimePrice realtimePrice) {
		kt.send(topic, realtimePrice);
	}
}

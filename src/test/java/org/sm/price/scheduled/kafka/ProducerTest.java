package org.sm.price.scheduled.kafka;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.sm.price.scheduled.model.RealtimePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProducerTest {

	@Autowired
	private KafkaProducer producer;

	@Test
	void producer() {
		RealtimePrice rt = new RealtimePrice("VSTQ", "Test stock", new BigDecimal(12000.00), "NSE");
		producer.sendMessage(rt);
	}
}

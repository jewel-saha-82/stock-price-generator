package org.sm.price.scheduled.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConsumerTest {
	
	@Autowired
	private KafkaConsumer consumer;

	@Test
	void consumer() {
		//consumer.
	}
}

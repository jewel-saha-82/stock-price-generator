package org.sm.price.scheduled.generate;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sm.price.scheduled.kafka.KafkaProducer;
import org.sm.price.scheduled.model.RealtimePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class PriceGenerationScheduler {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private PriceGenerationSchedulerHelper helper;

	@Autowired
	private KafkaProducer producer;

	@Scheduled(fixedDelay = 1000, initialDelay = 3000)
	public void priceGeneration() throws JsonProcessingException {
		List<RealtimePrice> realtimePrices = helper.getRealtimePrices();
		realtimePrices.stream().forEach(x -> {
			producer.sendMessage(x);
			logger.info("{}", x);
		});
	}

}

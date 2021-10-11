/**
 * 
 */
package org.sm.price.scheduled.generate;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.fasterxml.jackson.core.JsonProcessingException;

@SpringBootTest
class PriceGenerationSchedulerTest {

	int num = 10;

	@MockBean
	private Random random;

	@Autowired
	private PriceGenerationScheduler scheduler;

	@Test
	void scheduledTest() throws JsonProcessingException {
		when(random.nextDouble()).thenReturn(1.00);
		scheduler.priceGeneration();
		verify(random, times(num)).nextDouble();
	}

}

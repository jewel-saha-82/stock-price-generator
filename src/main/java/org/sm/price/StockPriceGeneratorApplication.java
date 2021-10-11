package org.sm.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StockPriceGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPriceGeneratorApplication.class, args);
	}

}

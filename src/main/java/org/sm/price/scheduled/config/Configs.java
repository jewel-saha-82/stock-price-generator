package org.sm.price.scheduled.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {

	@Bean
	public Random getRandom() {
		return new Random();
	}
}

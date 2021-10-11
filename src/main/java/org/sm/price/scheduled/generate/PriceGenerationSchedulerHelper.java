package org.sm.price.scheduled.generate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.sm.price.scheduled.model.RealtimePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PriceGenerationSchedulerHelper {

	@Autowired
	private Random price;

	private final String NSE = "nse";

	public RealtimePrice getRealtimePrice(final String code, final String stockName, int rangeMin, int rangeMax,
			String exchange) {
		return new RealtimePrice(code, stockName, getValueWithScale(getRandomPrice(rangeMin, rangeMax)), exchange);
	}

	public List<RealtimePrice> getRealtimePrices() {

		List<RealtimePrice> realtimePrices = new ArrayList<>();

		realtimePrices.add(getRealtimePrice("GUJHO", "Gujarat Hotel Ltd.", 155, 200, NSE));
		realtimePrices.add(getRealtimePrice("ITC", "ITC Ltd.", 212, 240, NSE));
		realtimePrices.add(getRealtimePrice("MARKSANS", "Marksans Pharma Ltd.", 68, 78, NSE));
		realtimePrices.add(getRealtimePrice("ALEMBIC", "Alembic Pharma Ltd.", 815, 945, NSE));
		realtimePrices.add(getRealtimePrice("AURO", "Aurobindo Pharma Ltd.", 745, 790, NSE));
		realtimePrices.add(getRealtimePrice("VST", "VST Global Ltd.", 300, 325, NSE));
		realtimePrices.add(getRealtimePrice("CEAT", "Ceat Tyres Ltd.", 602, 630, NSE));
		realtimePrices.add(getRealtimePrice("GNFC", "Gujarat Narmada Valley Corp. Ltd.", 403, 435, NSE));
		realtimePrices.add(getRealtimePrice("RAJEXP", "Rajesh Export Ltd.", 550, 622, NSE));
		realtimePrices.add(getRealtimePrice("SAIL", "Steel Authority of India Ltd.", 126, 135, NSE));

		// Unmodifiable List
		Collections.unmodifiableList(realtimePrices);

		return realtimePrices;
	}

	public BigDecimal getValueWithScale(double val) {
		return new BigDecimal(val).setScale(2, RoundingMode.HALF_UP);
	}

	public double getRandomPrice(int min, int max) {
		return price.nextDouble() * (max - min) + min;
	}

}

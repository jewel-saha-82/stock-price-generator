package org.sm.price.scheduled.model;

import java.math.BigDecimal;
import java.util.Objects;

public class RealtimePrice {

	// ID
	private String code;
	private String name;
	private BigDecimal price;
	private String exchange;

	public RealtimePrice() {
		// TODO Auto-generated constructor stub
	}

	public RealtimePrice(String code, String name, BigDecimal price, String exchange) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.exchange = exchange;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getExchange() {
		return exchange;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, exchange, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RealtimePrice))
			return false;
		RealtimePrice other = (RealtimePrice) obj;
		return Objects.equals(code, other.code) && Objects.equals(exchange, other.exchange)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "RealtimePrice [code=" + code + ", name=" + name + ", price=" + price + ", exchange=" + exchange + "]";
	}

}

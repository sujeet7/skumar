package com.sujeet.microservices.limitservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class LimitConfiguration {
	
	private Long maxLimit;
	private Long minLimit;
	
	public LimitConfiguration() {
		super();
	}

	public LimitConfiguration(Long maxLimit, Long minLimit) {
		super();
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}
	
	public Long getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(Long maxLimit) {
		this.maxLimit = maxLimit;
	}
	public Long getMinLimit() {
		return minLimit;
	}
	public void setMinLimit(Long minLimit) {
		this.minLimit = minLimit;
	}
	
	

}

package com.clientui.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.clientui.exceptions.CustomErrorDecodor;

@Configuration
public class FeignExceptionConfig {
	
	@Bean
	public CustomErrorDecodor mCustomErrorDecoder() {
		return new CustomErrorDecodor();
	}

}

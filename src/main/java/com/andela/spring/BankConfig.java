package com.andela.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

	@Bean
	public BankBranch newBranch() {
		return new BankBranch();
	}

}

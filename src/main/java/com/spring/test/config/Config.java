package com.spring.test.config;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= { "com.spring.test" } )
public class Config {
	
	@Bean
	public Long getId() {
		return Long.valueOf(0);
	}
	
	@Bean(name = "summary1")
	public String getSummary() {
		return "Spring DI";
	}
	
	@Bean 
	@Qualifier("description2")
	public String getDescription() {
		return "Dependencey in Spring is a powerful feature for invertion of control";
	}
	
	@Bean
	public Boolean isDone() {
		return Boolean.FALSE;
	}
	
	@Bean
	public Date getDudeDate() {
		return new Date(0);
	}
}

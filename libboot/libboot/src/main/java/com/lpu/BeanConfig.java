package com.lpu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import com.lpu.algo.MyPasswordEncoder;
import com.lpu.algo.NoEffectEncoder;

@Configuration
@ImportResource("classpath:beans.xml")
public class BeanConfig {
	
	@Bean
	@Primary
	MyPasswordEncoder getMypEncoder()
	{
		return new NoEffectEncoder();
	}
}

package com.lpu;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

import com.lpu.algo.MyPasswordEncoder;
import com.lpu.algo.NoEffectEncoder;

@Configuration
@ImportResource("classpath:beans.xml")
public class BeanConfig {
	// 3 methods of creating bean : (spring will create bean (object))
	// 1. annotate with component/service/repository
	// 2. Add a class @Configuration and create bean from methods
	// 3. Add a file beans.xml and create beans in it.
	
	// Dependency Injection : Controller -> Service -> Repository
	// BookSerivce s = new BookServiceImpl(); XXXXX NO
	//	@Autowired BookService bookService; 
	// Inject the object, my module is dependent on 
	
	@Bean(name = "encoder1")
	@Primary
	MyPasswordEncoder getMypEncoder()
	{
		return new NoEffectEncoder();
	}
	@Bean(name = "encoder2")
	@Qualifier(value = "encoder2")
	MyPasswordEncoder getGenericEncoder()
	{
		return new MyPasswordEncoder() {
			{
				System.out.println("generic encode created");
			}
			
			@Override
			public boolean match(String encoded, String pass) {
				return encoded.equals(pass);
			}
			
			@Override
			public String encode(String pass) {
				return pass;
			}
		};
	}

}

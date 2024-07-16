package com.lpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lpu.algo.MyPasswordEncoder;
import com.lpu.algo.MyRegistrar;
import com.lpu.algo.NoEffectEncoder;

@SpringBootApplication
public class LibbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LibbootApplication.class, args);
		//context manages all my created objects
		MyPasswordEncoder bean = context.getBean(MyPasswordEncoder.class);
		System.out.println(bean);
		NoEffectEncoder bean2 = context.getBean(NoEffectEncoder.class);
		System.out.println(bean2);
		
		MyRegistrar registrar = context.getBean(MyRegistrar.class);
		registrar.show();
	}

}

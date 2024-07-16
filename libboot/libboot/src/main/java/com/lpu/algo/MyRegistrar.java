package com.lpu.algo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRegistrar {
	
	@Resource(name="encoder1")
	MyPasswordEncoder encoder1;
	
	@Resource(name="encoder2")
	MyPasswordEncoder encoder2;
	public void show()
	{
		System.out.println(encoder1);
		System.out.println(encoder2);
	}
 
}

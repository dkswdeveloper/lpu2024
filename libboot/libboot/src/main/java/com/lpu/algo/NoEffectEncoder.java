package com.lpu.algo;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class NoEffectEncoder implements MyPasswordEncoder{
	@Override
	public String encode(String pass) {
		return pass ;
	}
	@Override
	public boolean match(String encoded, String pass) {
		return encoded.equals(pass);
	}
}

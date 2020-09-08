package com.mcs.sa;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(SampleContoller.class);
	
	@RequestMapping("/get")
	public String index() {
		return "Hi Ismail ...From Rest Call..?";
	}
	
	@RequestMapping(value = "/getOtp", method = RequestMethod.GET)
	public String getOtp() {
		int length = 4;
		String numbers = "0123456789";
		Random random = new Random();
		char otp[] = new char[length];
		for(int i=0;i<length;i++) {
			otp[i] = numbers.charAt(random.nextInt(10));
		}
		return "Your One Time Password is: "+String.valueOf(otp)+" .\nUse this within 1 minute.";
	}
}

package com.sxt.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {
	
	public static void main(String[] args) throws IOException {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
	
		System.out.println("服务提供者启动成功");
		System.in.read();
	}

}

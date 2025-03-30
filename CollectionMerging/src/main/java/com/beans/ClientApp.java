package com.beans;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean
		Class c1 = context.getBean("c1",Class.class);
		System.out.println("c1 data"+c1+" c1 class name"+c1.getClass());
		//get bean
		Calendar c2 = context.getBean("c2",Calendar.class);
		System.out.println("c2 data"+c2+" c2 class name"+c2.getClass());
		//get bean
		String s2 = context.getBean("s2",String.class);
		System.out.println("s2 data"+s2+" s2 class name"+s2.getClass());
		//get bean
		String s3 = context.getBean("s3",String.class);
		System.out.println("s3 data"+s3+" s3 class name"+s3.getClass());
	}
}

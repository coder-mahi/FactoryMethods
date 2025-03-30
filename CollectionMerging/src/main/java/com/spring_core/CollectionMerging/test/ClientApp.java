package com.spring_core.CollectionMerging.test;
import com.spring_core.CollectionMerging.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientApp {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EnggCourse ece = context.getBean("ece1styear",EnggCourse.class);
		System.out.println(ece);
	}
}

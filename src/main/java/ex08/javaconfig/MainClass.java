package ex08.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex01.SpringTest;
import ex03.setter.DataBaseDev;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(javaConfig.class);
		
		
		SpringTest t = ctx.getBean(SpringTest.class);
		t.test();
		
		
		
//		DataBaseDev dev = ctx.getBean(DataBaseDev.class);
//		System.out.println(dev.getUrl());
//		System.out.println(dev.getUid());
//		System.out.println(dev.getUpw());
	}
}

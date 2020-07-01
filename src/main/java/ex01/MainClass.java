package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		SpringTest s = new SpringTest();
//		s.test();
//		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");
																			// "위에는 설정파일 경로를 넣음."
		
		SpringTest s = ctx.getBean(SpringTest.class);
		s.test();
		
	}
}

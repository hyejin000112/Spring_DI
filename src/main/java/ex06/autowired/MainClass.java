package ex06.autowired;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired-context.xml");
		
		//autowired확인
		Printer pt = ctx.getBean(Printer.class);
		System.out.println(pt.getDoc1().data);
		
		//resource확인
		Printer2 pt2 = ctx.getBean(Printer2.class);
		System.out.println(pt2.getDocument().data);
		
	}
}

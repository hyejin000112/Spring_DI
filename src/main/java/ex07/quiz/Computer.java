package ex07.quiz;


import org.springframework.beans.factory.annotation.Autowired;


public class Computer {

	@Autowired
	private Mouse mouse;

	@Autowired
	private Keyboard kb;

	@Autowired
	private Monitor monitor;
	




	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
	
	
	
	
	
	
	
}

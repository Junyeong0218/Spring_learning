package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
		
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}
}

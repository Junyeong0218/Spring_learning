package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.DIConfig;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(DIConfig.class);
		
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.println(exam.total());
		System.out.println("--------------------------");
		System.out.println(exam.avg());
		
//		Exam exam = new NewlecExam(1, 1, 1, 1);
//		
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//					new Class[] {Exam.class}, 
//					new InvocationHandler() {
//						
//						@Override
//						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//							long start = System.currentTimeMillis();
//							
//							Object result = method.invoke(exam, args);
//							
//							try {
//								Thread.sleep(200);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//								  
//							long end = System.currentTimeMillis();
//								  
//							String message = (end - start) + "ms?? ?ɷȽ??ϴ?.";
//							System.out.println(message);
//							
//							return result;
//						}
//					});
		
	}
}

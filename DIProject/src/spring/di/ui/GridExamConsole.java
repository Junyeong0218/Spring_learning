package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {

	@Autowired
	private Exam exam;
	
	public GridExamConsole() { }
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("����������������������������������������������");
		System.out.println("��   total   ��   avg   ��");
		System.out.println("����������������������������������������������");
		 System.out.printf("��   %3d     ��  %3.2f  ��\n", exam.total(), exam.avg());
		System.out.println("����������������������������������������������");

	}
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}
}

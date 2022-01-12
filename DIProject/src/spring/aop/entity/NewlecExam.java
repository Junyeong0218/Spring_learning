package spring.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;

	@Override
	public int total() {

		int result = kor + eng + math + com;
		 
		return result;
	}

	@Override
	public float avg() {

		float result = total() / 4.0f;

		return result;
	}
}

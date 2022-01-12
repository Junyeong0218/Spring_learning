package spring.di.entity;

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
		return kor + eng + math + com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}
}

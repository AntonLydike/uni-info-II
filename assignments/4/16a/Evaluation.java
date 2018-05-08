package aufgabe16a;

import java.util.Date;

public class Evaluation {
	private double grade;
	private String remark;
	private int attempt;
	private Date date;
	private Student examinee;
	
	public Evaluation (Student s) {
		setExaminee(s);
	}
	
	public void setExaminee(Student s) {
		examinee = s;
	}
}

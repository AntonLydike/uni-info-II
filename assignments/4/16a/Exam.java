package aufgabe16a;

import java.util.ArrayList;

public class Exam {
	private ArrayList<Evaluation> evaluations;
	
	public void linkEvaluation (Evaluation e) {
		evaluations.add(e);
	}
	
	public void unlinkEvaluation(Evaluation e) {
		evaluations.remove(e);
	}
 }

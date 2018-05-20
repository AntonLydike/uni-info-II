package aufgabe22;

import java.awt.*;

public class B extends Frame {
	private static final long serialVersionUID = 1L;
	
	public B () {
		super("Aufgabe22b");
		FlowLayout flow = new FlowLayout();
		
		Label label = new Label("Anzahl auswählen:");
		label.setFont(new Font("Arial", Font.BOLD, 16));
		
		Choice choice = new Choice();
		for (int i = 0; i <= 9; i++) {
			choice.add(String.valueOf(i));
		}
		choice.select(1);
		
		this.add(label);
		this.add(choice);
		
		this.setLayout(flow);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		B b = new B();
	}
}

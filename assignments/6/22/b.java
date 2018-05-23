package aufgabe22;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	public static void main(String[] args) {
		new B();
	}
}

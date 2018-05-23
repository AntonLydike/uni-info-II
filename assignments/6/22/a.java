package aufgabe22;

import java.awt.*;
import java.awt.event.*;

public class A extends Frame {
	private static final long serialVersionUID = 1L;

	public A () {
		super("Aufgabe22a");
		GridLayout grid = new GridLayout(3,2);
		grid.setHgap(4);
		
		Label labels[] = {
			new Label("Vorname:", Label.RIGHT),
			new Label("Name:", Label.RIGHT),
			new Label("Ort:", Label.RIGHT)
		};
		
		for (Label label : labels) {
			label.setForeground(Color.BLUE);
			label.setFont(new Font("Arial", Font.BOLD, 16));
			this.add(label);
			this.add(new TextField());
		}
		
		this.setLayout(grid);
		this.pack();
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new A();
	}
}

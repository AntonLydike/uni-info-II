package aufgabe25;

import java.awt.*;
import java.awt.event.*;

public class History extends Dialog {
	private static final long serialVersionUID = 1L;
	
	public History (Frame f, java.util.ArrayList<Double> list) {
		super(f, "History", true);
		
		GridLayout gl = new GridLayout(list.size(), 1);
		this.setLayout(gl);
		
		for (int i = list.size(); i > 0; i--) {
			this.add(new Label(String.valueOf(list.get(i-1))));
		}

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
		this.pack();
		this.setVisible(true);
	}
}

package aufgabe25;

import java.awt.*;
import java.awt.event.*;

public class History extends Dialog {
	private static final long serialVersionUID = 1L;
	
	public History (Frame f, java.util.ArrayList<Double> list) {
		super(f, "History", true);
		
		FlowLayout fl = new FlowLayout();
		List l = new List(10);
		
		for (int i = list.size(); i > 0; i--) {
			l.add(String.valueOf(list.get(i-1)));
		}

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});

		this.setLayout(fl);
		this.add(l);
		this.pack();
		this.setVisible(true);
	}
}

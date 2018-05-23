package aufgabe24;

import java.awt.*;
import java.awt.event.*;

public class B extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	double size = 100;
	Button larger = new Button("+");
	Button smaller = new Button("-");
	
	public B () {
		super("");

		GridLayout grid = new GridLayout(2,1);
		this.setLayout(grid);
		this.add(larger);
		this.add(smaller);

		larger.addActionListener(this);
		smaller.addActionListener(this);
		
		this.setTitle(String.valueOf(size));
		this.setSize(new Dimension((int) size, (int) size));
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(larger)) {
			size *= 1.1;
		} else if (e.getSource().equals(smaller)) {
			size *= 0.9;
		}
		
		this.setSize(new Dimension((int) size, (int) size));
		this.setTitle(String.valueOf((int) size));
	}
	
	public static void main(String[] args) {
		new B();
	}
}

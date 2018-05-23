package aufgabe24;

import java.awt.*;
import java.awt.event.*;

public class A extends Frame {
	private static final long serialVersionUID = 1L;

	public A () {
		super("0");
		this.setVisible(true);
		this.setSize(new Dimension(500, 50));

		A a = this;

		this.addWindowListener(new WindowAdapter() {
			int tries = 0;

			public void windowClosing(WindowEvent we) {
				a.setTitle(String.valueOf(++tries));
				if (tries == 3) {
					dispose();
				}
			}
		});
	}

	public static void main(String[] args) {
		new A();
	}
}

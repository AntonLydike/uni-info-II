package aufgabe23;

import java.awt.*;
import java.awt.event.*;

public class A extends Frame implements KeyListener {
	private static final long serialVersionUID = 1L;

	public A () {
		super("aufgabe23a");
		this.setVisible(true);
		this.setSize(new Dimension(200, 200));
		this.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		A a = new A();
	}
	
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() == 'x') {
			this.dispose();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}
}

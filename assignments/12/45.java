import java.awt.*;
import java.awt.event.*;

public class Aufgabe45 extends Frame implements Runnable, KeyListener {
	private static final long serialVersionUID = 1L;
	private Color color = Color.RED;
	private boolean running = false;
	private Thread thread;
	
	public Aufgabe25() {
		addKeyListener(this);
		setSize(100,  100);
		setBackground(this.color);
		setVisible(true);
	}
	
	public void toggleBackground() {
		if (color.equals(Color.RED)) {
			color = Color.GREEN;
		} else {
			color = Color.RED;
		}
		setBackground(color);
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyChar()) {
			case 's':
				if (thread != null) break;
				running = true;
				thread = new Thread(this);
				thread.start();
				break;
			case 'q':
				if (thread == null) break;
				running = false;
				thread.interrupt();
				thread = null;
		}
	}

	@Override
	public void run() {
		while (running) {
			try {
				Thread.sleep(500);
				this.toggleBackground();
			} catch (InterruptedException e) {
				running = false;
			}
		}
	}
}

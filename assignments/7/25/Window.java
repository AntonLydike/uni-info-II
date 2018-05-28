package aufgabe25;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Window extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private java.util.ArrayList<Double> history = new ArrayList<Double>();
	private Button btn_rn = new Button("random");
	private Button btn_hs = new Button("history");
	private TextField tf  = new TextField();
	
	public Window() {
		super("Aufgabe25");
		FlowLayout fl = new FlowLayout();
		this.add(btn_rn);
		this.add(tf);
		this.add(btn_hs);
		btn_rn.addActionListener(this);
		btn_hs.addActionListener(this);
		
		tf.setPreferredSize(new Dimension(150, 16));
		
		this.setLayout(fl);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});

		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.btn_rn)) {
			generateRandom();
		} else if (e.getSource().equals(this.btn_hs)) {
			showHistory();
		}
	}
	
	private void generateRandom() {
		double r = Math.random();
		this.history.add(r);
		this.tf.setText(String.valueOf(r));
	}
	
	private void showHistory() {
		new aufgabe25.History(this, this.history);
	}
}

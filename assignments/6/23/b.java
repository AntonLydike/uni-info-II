package aufgabe23;

import java.awt.*;
import java.awt.event.*;

public class B extends Frame implements ItemListener {
	private static final long serialVersionUID = 1L;
	private TextField t;
	
	public B () {
		super("aufgabe23b");
		
		BorderLayout bl = new BorderLayout();
		FlowLayout fl = new FlowLayout();
		Choice c = new Choice();
		Panel p = new Panel();
		t = new TextField();
		
		this.setLayout(bl);
		this.add(p, BorderLayout.NORTH);
		this.add(t, BorderLayout.SOUTH);

		p.setLayout(fl);
		p.add(new Label("Bemerkung"));
		p.add(c);
		
		c.add("ja");
		c.add("nein");
		c.select(1);
		c.addItemListener(this);
		
		t.setVisible(false);
		
		this.pack();
		this.setVisible(true);		
	}
	
	public void itemStateChanged (ItemEvent e) {
		t.setVisible(e.getItem() == "ja");
		this.pack();
	}
	
	public static void main(String[] args) {
		B b = new B();
	}
}

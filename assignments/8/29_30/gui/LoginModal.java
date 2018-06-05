package blatt08.gui;

import blatt08.store.Credentials;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginModal extends Dialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	private TextField tf_user  = new TextField();
	private TextField tf_password  = new TextField();
	private Button btn_login = new Button("login");
	private Button btn_cancel = new Button("cancel");

	private Credentials credentials = new Credentials();


	public LoginModal(Frame f) {
		super(f, "Enter Login credentials", true);
		
		FlowLayout fl = new FlowLayout();

		btn_login.addActionListener(this);
		btn_cancel.addActionListener(this);

		tf_user.setPreferredSize(new Dimension(150, 16));
		tf_user.setText("student");
		tf_password.setText("inFormatik2");
		this.add(tf_user);

		tf_password.setPreferredSize(new Dimension(150, 16));
		this.add(tf_password);
		this.add(btn_login);
		this.add(btn_cancel);


		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});

		this.setLayout(fl);
		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.btn_login)) {
			saveCredentials();
			this.setVisible(false);
			this.dispose();
		} else if (e.getSource().equals(this.btn_cancel)) {
			System.out.println("cancel clicked");
			this.setVisible(false);
			this.dispose();
		}
	}

	private void saveCredentials(){
		credentials.setUsername(tf_user.getText());
		credentials.setPassword(tf_password.getText());
	}


	public Credentials showDialog() {
		this.setVisible(true);
		return this.credentials;
	}
}

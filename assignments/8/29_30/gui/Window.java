package blatt08.gui;

import blatt08.data.EmployeeContainer;
import blatt08.store.Credentials;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;

public class Window extends Frame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private ArrayList<Double> history = new ArrayList<Double>();
    private Button btn_connect = new Button("connect");
    private Button btn_load = new Button("load");
    private LoginModal loginModal;

    private EmployeeContainer container;
    private Label anzeige;
    private Credentials credentials;
    private ListEmployee listEmployee;


    public Window() {
        super("Aufgabe29+30");

        this.loginModal = new LoginModal(this);
        FlowLayout fl = new FlowLayout();

        btn_connect.addActionListener(this);
        this.add(btn_connect);

        btn_load.setEnabled(false);
        btn_load.addActionListener(this);
        this.add(btn_load);

        anzeige = new Label("Programmfenster");
        this.add(anzeige, BorderLayout.CENTER);
        anzeige.setText("Bitte logge dich zuerst ein.");

        this.setLayout(fl);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                container.close();
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
        if (e.getSource().equals(this.btn_connect)) {
            showLoginModal();
        } else if (e.getSource().equals(this.btn_load)) {
            loadData();
        }
    }

    private void showLoginModal() {
        credentials = this.loginModal.showDialog();
        if (credentials != null) {
            try {
                container = EmployeeContainer.instance(credentials.getUsername(), credentials.getPassword());
                anzeige.setText("Login erfolgreich.");
            } catch (SQLException e) {
                //m.setEnabled(false);
                anzeige.setText("Laden aus Datenbank fehlgeschlagen" + e.getMessage());
            } catch (ClassNotFoundException e) {
                anzeige.setText("Datenbanktreiber nicht gefunden: " + e.getMessage());
                // m.setEnabled(false);
            }

            btn_load.setEnabled(true);
        }
    }

    private void loadData() {
        try {
            anzeige.setText("Daten werden geladen...");
            listEmployee = new ListEmployee(this, container);
            anzeige.setText("Daten erfolgreich geladen.");
        } catch (SQLException e) {
            listEmployee.setVisible(false);
            anzeige.setText("Laden aus Datenbank fehlgeschlagen" + e.getMessage());
        }
    }
}

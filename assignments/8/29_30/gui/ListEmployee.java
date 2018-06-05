package blatt08.gui;

import blatt08.data.EmployeeContainer;
import blatt08.store.Employee;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;

public class ListEmployee extends Dialog implements ActionListener, Observer {

    private EmployeeContainer container;
    private List allEmployeesList;

    public ListEmployee(Window f, EmployeeContainer container) throws SQLException {

        super(f, "Alle Angestellten anzeigen", false);

        this.setLayout(new GridLayout(0, 1));
        this.container = container;

        Panel unten = new Panel();
        add(unten);
        unten.setLayout(new BorderLayout());

        Label alleAngestelltenLabel = new Label("Alle Angestellten: ");
        unten.add(alleAngestelltenLabel, BorderLayout.NORTH);

        allEmployeesList = new List();
        unten.add(allEmployeesList, BorderLayout.CENTER);
        allEmployeesList.setEnabled(true);

        Panel s = new Panel();
        unten.add(s, BorderLayout.SOUTH);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setLocation(f.getLocation().x + 200, f.getLocation().y + 200);


        container.addObserver(this);
        update(container, null);
        container.load();

        pack();
        setVisible(true);
    }

    public void update(Observable o, Object arg) {
        allEmployeesList.removeAll();

        for (Employee a : container) {
            allEmployeesList.add(a.toString());
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Angestellten löschen")) {
            // onDelete();
        } else if (e.getActionCommand().equals("Abbrechen")) {
            onCancel();
        }
    }

    private void onCancel() {
        dispose();
    }

}

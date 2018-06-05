package blatt08.a31;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Bibliotheksverwaltung extends Frame implements ActionListener{
    private Button close;

    public Bibliotheksverwaltung() {
        super("Aufgabe 31");
        close = new Button("Close");
        close.addActionListener(this);

        this.add(close, BorderLayout.CENTER);
        try {
            BuchContainer.instance();
        } catch (LoadSaveException e) {
            dispose();
        }

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        this.pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource().equals(close) ) {
            setVisible(false);
            dispose();
        }
    }
}

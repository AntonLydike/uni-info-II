package aufgabe44.b;

import blatt10.MausCanvas;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MausFrame extends Frame implements MouseListener {

    MausCanvas canvas;

    private Label clickLabel = new Label();

    public MausFrame() {
        super("Maus Frame");
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        addMouseListener(this);
        clickLabel.addMouseListener(this);
        add(clickLabel);

        setSize(100, 100);


        setVisible(true);
        clickLabel.setVisible(true);

    }

    public static void main(String args[]) {
        new MausFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        clickLabel.setText("clicked");
        clickLabel.revalidate();

        clickLabel.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        clickLabel.setText("pressed");
        clickLabel.revalidate();
        clickLabel.setLocation(e.getX(), e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        clickLabel.setText("clicked");
        clickLabel.revalidate();

        clickLabel.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
}


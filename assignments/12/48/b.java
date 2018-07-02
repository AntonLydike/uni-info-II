package blatt12;


import java.awt.*;
import java.awt.event.*;

public class MausFrame extends Frame implements MouseListener, MouseMotionListener {

    int width = 50;
    int height = 50;

    public MausFrame() {
        super();
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(width, height);
        setVisible(true);

    }

    public static void main(String args[]) {
        new MausFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.setTitle("X: " + e.getX() + " - Y: " + e.getY());
    }
}


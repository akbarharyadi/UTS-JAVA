import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppMouse extends JFrame implements MouseListener {

    JLabel lbInfo = new JLabel("Java");

    public AppMouse() {
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Aplikasi Mouse");

        add(lbInfo);

        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
        int x = e.getX() - 5;
        int y = e.getY() - 45;
        lbInfo.setBounds(x, y, 80, 20);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX() - 5;
        int y = e.getY() - 45;
        lbInfo.setBounds(x, y, 80, 20);
    }

    public static void main(String[] args) {
        new AppMouse();
    }
}

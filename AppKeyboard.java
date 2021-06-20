import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppKeyboard extends JFrame implements KeyListener {

    JLabel lbInfo = new JLabel();
    int x = 100;
    int y = 50;

    public AppKeyboard() {
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setTitle("Aplikasi Keyboard");
        setIconImage(new ImageIcon(this.getClass().getResource("/images/car.png")).getImage());
        add(lbInfo);
        lbInfo.setBounds(x, y, 80, 80);
        lbInfo.setIcon(new ImageIcon(this.getClass().getResource("/images/car.png")));

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                y = y - 10;
                break;
            case KeyEvent.VK_DOWN:
                y = y + 10;
                break;
            case KeyEvent.VK_LEFT:
                x = x - 10;
                break;
            case KeyEvent.VK_RIGHT:
                x = x + 10;
                break;
        }
        lbInfo.setBounds(x, y, 80, 80);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new AppKeyboard();
    }
}

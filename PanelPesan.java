import javax.swing.*;
import java.awt.*;

public class PanelPesan extends JPanel {
    JLabel label1 = new JLabel("Welcome To Java World");
    JLabel label2 = new JLabel("Javax.swing");

    public PanelPesan() {
        setLayout(null);
        // Merubah font label dengan jenis font Tahoma 18pt plain
        label1.setFont(new Font("Tahoma", 1, 18));
        // Menempatkan JLabel ke dalam panel
        label1.setBounds(20, 30, 250, 30);
        label2.setBounds(100, 75, 100, 20);
        // Menset warna label2 dengan warna biru
        label2.setForeground(Color.blue); // bisa juga dengan new Color(0, 0, 255)
        add(label1);
        add(label2);
    }

    public static void main(String[] args) {

        // Membuat object JFrame
        JFrame f = new JFrame();
        // Membuat object JPanel dari Class PanelPesan
        PanelPesan p = new PanelPesan();
        // Menempelkan object JPanel ke dalam object JFrame
        f.add(p);
        // Setting Frame window
        f.setTitle("Pesan Using extends JPanel");
        f.setVisible(true);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
    }

}

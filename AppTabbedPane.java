import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class AppTabbedPane extends JFrame {
    JTabbedPane tabb = new JTabbedPane();
    JScrollPane sp = new JScrollPane();
    JPanel satu = new JPanel();
    JPanel dua = new JPanel();
    JLabel lbSatu = new JLabel("Ini panel ke-satu");
    JLabel lbDua = new JLabel("Ini panel ke-dua");

    public AppTabbedPane() {
        setLayout(null);
        sp.setBounds(0, 0, 300, 200);
        sp.setViewportView(tabb);
        tabb.addTab("Tampilan 1", satu);
        tabb.addTab("Tampilan 2", dua);
        add(sp);
        satu.add(lbSatu);
        dua.add(lbDua);
        setTitle("Aplikasi TabbedPane");
        setSize(300, 230);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AppTabbedPane();
    }
}
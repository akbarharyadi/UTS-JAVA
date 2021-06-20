import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class DaduDigital extends JFrame implements ActionListener {
    String head, tail, teks;
    JButton btDoit = new JButton("Kocok");
    JLabel display = new JLabel();
    ImageIcon satu, dua, tiga, empat, lima, enam;
    // Membuat object untuk menghasilkan bilangan acak
    // dengan menggunakan class Random yang ada di package java.util
    Random random = new Random();
    // Menyimpan bilangan acak dari object Random
    int angka;

    public DaduDigital() {
        setLayout(null);
        display.setBounds(10, 0, 100, 100);
        display.setHorizontalAlignment(JLabel.CENTER);
        btDoit.setBounds(10, 110, 100, 20);
        add(display);
        add(btDoit);
        btDoit.addActionListener(this);
        setSize(120, 170);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        satu = new ImageIcon(this.getClass().getResource("/images/1.jpg"));
        dua = new ImageIcon(this.getClass().getResource("/images/2.jpg"));
        tiga = new ImageIcon(this.getClass().getResource("/images/3.jpg"));
        empat = new ImageIcon(this.getClass().getResource("/images/4.jpg"));
        lima = new ImageIcon(this.getClass().getResource("/images/5.jpg"));
        enam = new ImageIcon(this.getClass().getResource("/images/6.jpg"));
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == btDoit)
            createDice();
    }

    public void createDice() {
        angka = random.nextInt(6) + 1;
        switch (angka) {
            // Menampilkan bilangan dadu dalam format table HTML
            case 1:
                display.setIcon(satu);
                break;
            case 2:
                display.setIcon(dua);
                break;
            case 3:
                display.setIcon(tiga);
                break;
            case 4:
                display.setIcon(empat);
                break;
            case 5:
                display.setIcon(lima);
                break;
            case 6:
                display.setIcon(enam);
                break;
        }
    }

    public static void main(String[] args) {
        new DaduDigital();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AppRadio extends JFrame implements ActionListener {
    JRadioButton ibujari = new JRadioButton("Ibujari", true);
    JRadioButton telunjuk = new JRadioButton("Telunjuk", false);
    JRadioButton kelingking = new JRadioButton("Kelingking", false);
    ButtonGroup grup = new ButtonGroup();
    JButton btDoit = new JButton("Do it");
    // Object random untuk menentukan pilihan jari oleh komputer
    Random random = new Random();

    public AppRadio() {
        // Layout dibebaskan untuk penempatan komponen
        setLayout(null);
        grup.add(ibujari);
        grup.add(telunjuk);
        grup.add(kelingking);
        ibujari.setBounds(10, 10, 100, 20);
        telunjuk.setBounds(10, 30, 100, 20);
        kelingking.setBounds(10, 50, 100, 20);
        btDoit.setBounds(10, 80, 100, 20);

        add(ibujari);
        add(telunjuk);
        add(kelingking);
        add(btDoit);
        btDoit.addActionListener(this);
        setTitle("Game Suit");
        setSize(250, 150);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btDoit)
            mulaiSuit();
    }

    public void mulaiSuit() {
        int comp = random.nextInt(3);// Menyimpan pilihan oleh komputer
        // 0: Ibujari, 1:Telunjuk, 2:Kelingking
        int user = 0;
        String hasil = "";
        String jari[] = { "Ibujari", "Telunjuk", "Kelingking" };
        // Jika user milih Ibu Jari
        if (ibujari.isSelected()) {
            user = 0;
            if (comp == 0)
                hasil = "SERI";
            if (comp == 1)
                hasil = "Anda MENANG";
            if (comp == 2)
                hasil = "Anda KALAH";
        }
        // Jika user milih Telunjuk
        if (telunjuk.isSelected()) {
            user = 1;
            if (comp == 0)
                hasil = "Anda KALAH";
            if (comp == 1)
                hasil = "SERI";
            if (comp == 2)
                hasil = "Anda MENANG";
        }
        // Jika user milih Kelingking
        if (kelingking.isSelected()) {
            user = 2;
            if (comp == 0)
                hasil = "Anda MENANG";
            if (comp == 1)
                hasil = "Anda KALAH";
            if (comp == 2)
                hasil = "SERI";
        }
        hasil = "Comp: " + jari[comp] + ", User: " + jari[user] + "\n" + hasil;
        // Menampilkan hasil SUIT
        JOptionPane.showMessageDialog(null, hasil, "Hasilnya", JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] args) {
        new AppRadio();
    }
}
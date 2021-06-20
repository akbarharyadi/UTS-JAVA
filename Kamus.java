import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kamus extends JFrame implements ActionListener {
    String jenis[] = { "Jepang", "Sunda", "Inggris" };
    String kata[] = { "Makan", "Minum", "Bekerja", "Berjalan", "Tidur", "Lari", "Melihat" };
    String jepang[] = { "Taberu", "Nomu", "Shigoto", "Aruku", "Neru", "Hashiru", "Miru" };
    String sunda[] = { "Tuang", "Leueut", "Damel", "Papah", "Kulem", "Lumpat", "Ningal" };
    String inggris[] = { "Eat", "Drink", "Work", "Walk", "Sleep", "Run", "Look" };
    int ada;

    JLabel lbKet = new JLabel("Kata Indonesia: ");
    JTextField txKata = new JTextField(10);
    JComboBox cbo = new JComboBox(jenis);
    JButton btCari = new JButton("Terjemahan");

    public Kamus() {
        setLayout(null);
        this.setSize(220, 200);
        this.setVisible(true);
        this.setTitle("Kamus");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lbKet.setBounds(10, 10, 100, 20);
        txKata.setBounds(110, 10, 90, 20);
        cbo.setBounds(10, 50, 100, 20);
        btCari.setBounds(10, 120, 190, 20);
        add(lbKet);
        add(txKata);
        add(cbo);
        add(btCari);
        btCari.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        cariKata();

        if (ada > -1) {
            if (cbo.getSelectedItem().equals("Jepang")) {
                // terjemahan kata ditampilkan berdasarkan nomor index
                JOptionPane.showMessageDialog(null, jepang[ada]);
            } else if (cbo.getSelectedItem().equals("Sunda")) {
                JOptionPane.showMessageDialog(null, sunda[ada]);
            } else {
                JOptionPane.showMessageDialog(null, inggris[ada]);

            }
        } else {
            JOptionPane.showMessageDialog(null, "tidak ditemukan");

        }

    }

    public void cariKata() {
        String hasil = txKata.getText().toLowerCase();
        ada = -1;
        // Pencarian kata
        for (int index = 0; index < jepang.length; index++) {
            if (hasil.equals(kata[index].toLowerCase())) {
                ada = index; // jika ditemukan, nomor index disave
                break;

            }
        }

    }

    public static void main(String[] args) {
        new Kamus();

    }
}
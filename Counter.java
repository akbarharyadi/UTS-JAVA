
/*
*Menghitung Klik
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Counter extends JFrame implements ActionListener {

    JLabel lblJumlah;
    JButton btnTambah;
    JButton btnKurang;
    JButton btnClear;
    int jumlah = 0;
    // menambah field btnHitung yang awalnya tidak ada
    JButton btnHitung;

    public Counter() { // Constructor
        setLayout(null);
        createComponents();

        setSize(120, 150);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void createComponents() {// menyiapkan komponen yang dibutuhkan31
        lblJumlah = new JLabel("0");
        lblJumlah.setHorizontalAlignment(JLabel.CENTER);
        lblJumlah.setFont(new Font("Arial", 1, 48));
        lblJumlah.setForeground(new Color(255, 0, 0));
        btnHitung = new JButton("Add");
        btnHitung.setFont(new Font("Vendana", 1, 18));
        btnHitung.addActionListener(this);

        lblJumlah.setBounds(10, 20, 100, 50);
        btnHitung.setBounds(10, 80, 100, 20);

        add(lblJumlah);
        add(btnHitung);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnHitung)
            // perubahan yang di lakukan adalah mengganti
            // hitungKlik();
            // menjadi
            tambah();
    }

    public void tambah() {
        jumlah++;
        lblJumlah.setText(String.valueOf(jumlah));
    }

    public static void main(String[] args) {
        new Counter();
    }
}
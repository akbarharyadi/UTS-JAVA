
/*
Menampilkan data array setiap satu detik
*/
import javax.swing.*;
import java.awt.event.*;

public class AppTimer extends JFrame implements ActionListener {
    String[] kota = { "Bandung", "Ciawi", "Demak", "Garut", "Indramayu", "Jakarta", "Kerawang", "Padang", "Medan" };
    int no;
    Timer timer;
    JLabel lbKota = new JLabel("Wait…");

    public AppTimer() {
        setLayout(null);
        // Membuat object Timer dengan selang waktu 1000ms=1detik
        timer = new Timer(1000, this);
        timer.start();// timer diaktifkan
        // Variable no untuk petunjuk nomor indeks array kota
        no = 0;

        lbKota.setBounds(10, 20, 130, 20);
        add(lbKota);
        setTitle("Timer…");
        setSize(150, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == timer)
            // perubahan yang di lakukan adalah mengganti
            // pilihKota();
            // menjadi
            pilihKota(ae);
    }

    // perubahan yang di lakukan adalah mengganti
    // public void pilihKota();
    // menjadi
    public void pilihKota(ActionEvent ae) {
        // Mendeteksi aktivasi object Timer
        if (ae.getSource() == timer) {// dicek setip 1 detik
            lbKota.setText("Timer " + no + " : " + kota[no]);
            // Jika nomor indeks masih dalam batas jumlah elemen array kota
            if (no < kota.length - 1)
                no++; // nomer indeks ditambah
            else
                no = 0; // nomor indeks dikembalikan ke pertama
        }
    }

    public static void main(String[] args) {
        new AppTimer();
    }

}

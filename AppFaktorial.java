import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppFaktorial extends JFrame implements ActionListener {
    int bilangan;
    String strBilangan;
    JLabel lbBilangan = new JLabel("Bilangan: ");
    JTextField txBilangan = new JTextField(5);
    JButton btHitung = new JButton("Hitung");

    // Constructor: untuk inisialisasi
    // Mengatur posisi komponen GUI di Frame
    public AppFaktorial() {
        // Agar komponen dapat ditempatkan secara bebas
        setLayout(null);
        // Mengaktifkan button pada saat diKlik
        btHitung.addActionListener(this);
        // Menentukan koordinat komponen
        lbBilangan.setBounds(10, 10, 80, 20);
        txBilangan.setBounds(100, 10, 50, 20);
        btHitung.setBounds(170, 10, 80, 20);
        // Menempatkan JLabel, JTextField dan JButton ke dalam panel
        add(lbBilangan);
        add(txBilangan);
        add(btHitung);

        // Setting Frame window
        setTitle("Faktorial");
        setVisible(true);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    // Method yang akan aktif pada waktu tombol diklik
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btHitung)
            hitungFaktorial();
    }

    public void hitungFaktorial() {
        strBilangan = txBilangan.getText();
        // Konversi data dari String ke integer
        bilangan = Integer.parseInt(strBilangan);
        // Menghitung bilangan faktorial 4!=4x3x2x1=24
        int hasil = 1;
        for (int i = 1; i <= bilangan; i++) {
            hasil = hasil * i; // bisa ditulis juga hasil *= i
        }
        // Menampilkan hasil perhitungan
        JOptionPane.showMessageDialog(null, strBilangan + "! =" + hasil);
    }

    public static void main(String[] args) {

        // Menjalankan object aplikasi FrameFaktorial
        new AppFaktorial();
    }
}
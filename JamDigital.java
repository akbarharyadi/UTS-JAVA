import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class JamDigital extends JFrame implements ActionListener {

    JLabel lbWaktu = new JLabel();
    Timer timer;

    public JamDigital() {
        setTitle("Jam Digital");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(300, 100);

        lbWaktu.setFont(new Font("Arial", 1, 48));
        lbWaktu.setBounds(0, 20, 290, 40);
        lbWaktu.setHorizontalAlignment(JLabel.CENTER);
        add(lbWaktu);

        setWaktu();
        timer = new Timer(1000, this);
        timer.start();
    }

    public void setWaktu() {
        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int jam = kalender.get(Calendar.HOUR_OF_DAY);
        int menit = kalender.get(Calendar.MINUTE);
        int detik = kalender.get(Calendar.SECOND);
        String waktu = jam + ":" + menit + ":" + detik;
        lbWaktu.setText(waktu);
    }

    public void actionPerformed(ActionEvent ae) {
        setWaktu();
    }

    public static void main(String[] args) {
        new JamDigital();
    }
}
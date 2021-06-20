import javax.swing.*;
import java.awt.*;

public class FrameLabel extends JFrame {
    String kalimat = "Welcome To Java World";
    JLabel label = new JLabel();

    // Constructor: untuk inisialisasi
    // Mengatur posisi komponen GUI di Frame
    public FrameLabel() {
        setLayout(null);
        // Menempatkan JLabel ke dalam panel
        label.setText(kalimat);
        label.setFont(new Font("Tahoma", 1, 18));
        label.setBounds(10, 10, 250, 40);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);

        // Setting Frame window
        setTitle("Label");
        setVisible(true);
        setSize(270, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FrameLabel();
    }

}

import javax.swing.*;
import java.awt.*;

public class FrameWindow extends JFrame {
    // Constructor: untuk menset window
    public FrameWindow() {

        // Setting Frame window
        setTitle("Pesan");
        setVisible(true);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FrameWindow(); // memanggil constructor
    }

}

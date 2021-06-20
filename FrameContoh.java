import javax.swing.*;

public class FrameContoh extends JInternalFrame {
    public FrameContoh() {
        // Menset judul,resizable, closeable, maximizeable, minimizeable
        super("Contoh", true, true, false, false);
        setVisible(true);
        setSize(400, 200);
        // Diset DISPOSE_ON_CLOSE supaya
        // pada saat frame ini ditutup tidak menutup aplikasi keseluruhan
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FrameContoh();
    }
}
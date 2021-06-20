import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;

public class FrameJTable extends JFrame {
    String[] judul = { "Nama", "Harga", "Jenis" };
    JTable tabel;
    JScrollPane sp;

    public FrameJTable() {
        String[][] data = { { "Ballpoint", "20000", "ATK" }, { "Lemari Es", "4500000", "ELK" },
                { "Rak Buku", "780000", "MBL" }, { "Sprinb Bed", "3600000", "MBL" }, { "Buku Tulis", "19000", "ATK" },
                { "Komputer", "7700000", "ELK" } };
        tabel = new JTable(data, judul);
        sp = new JScrollPane(tabel);
        add(sp);
        setTitle("JTable");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {
        new FrameJTable();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener {
    JDesktopPane desktop;
    JToolBar toolBar = new JToolBar();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem itemContoh = new JMenuItem("Contoh");
    JMenuItem itemExit = new JMenuItem("Exit");
    JButton btContoh = new JButton("Contoh");

    public MainFrame() {
        fileMenu.add(itemContoh);
        fileMenu.addSeparator();
        fileMenu.add(itemExit);
        fileMenu.setMnemonic('F');// tekan tombol Alt+F
        itemContoh.setMnemonic('A');
        itemContoh.addActionListener(this);
        itemExit.addActionListener(this);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        btContoh.addActionListener(this);
        toolBar.add(btContoh);
        desktop = new JDesktopPane();
        add(toolBar, BorderLayout.NORTH);
        add(desktop, BorderLayout.CENTER);
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == itemContoh) {
            FrameContoh contoh = new FrameContoh();
            // menampilkan object FrameContoh di dalam object MainFrame
            desktop.add(contoh);
        }
        if (ae.getSource() == itemExit) {
            int ok = JOptionPane.showConfirmDialog(null, "mau Keluar?");
            if (ok == 0) {
                System.exit(0);// end of application
            }
        }
        if (ae.getSource() == btContoh) {
            FrameContoh contoh = new FrameContoh();
            desktop.add(contoh);
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
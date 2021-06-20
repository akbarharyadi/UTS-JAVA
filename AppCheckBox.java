import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppCheckBox extends JPanel implements ActionListener {
    JLabel lbBil = new JLabel("Bilangan : ");
    JTextField txBil = new JTextField(5);
    JCheckBox ckbFaktorial = new JCheckBox("Faktorial");
    JCheckBox ckbKuadrat = new JCheckBox("Kuadrat");
    JButton btHitung = new JButton("Test");

    public AppCheckBox() {
        setLayout(null);
        lbBil.setBounds(10, 10, 80, 20);
        txBil.setBounds(100, 10, 50, 20);
        ckbFaktorial.setBounds(10, 50, 100, 20);
        ckbKuadrat.setBounds(10, 80, 100, 20);
        btHitung.setBounds(10, 120, 100, 20);
        add(lbBil);
        add(txBil);
        add(ckbFaktorial);
        add(ckbKuadrat);
        add(btHitung);
        btHitung.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btHitung)
            hitungBilangan();
    }

    public void hitungBilangan() {

        int bilangan = Integer.parseInt(txBil.getText());
        String teks = "";
        if (ckbFaktorial.isSelected()) {
            int hasil = 1;
            for (int i = 1; i <= bilangan; i++) {
                hasil *= i; // hasil = hasil * i
            }
            teks += "Faktorial dari " + txBil.getText() + "= " + hasil;
        }
        if (ckbKuadrat.isSelected()) {
            int hasil = bilangan * bilangan;
            teks += "\nKuadrat dari " + txBil.getText() + "= " + hasil;
        }
        JOptionPane.showMessageDialog(null, teks);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Check Box");
        AppCheckBox pckb = new AppCheckBox();
        jf.add(pckb);
        jf.setSize(200, 200);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

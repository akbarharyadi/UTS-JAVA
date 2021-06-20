
/*
* Program aplikasi sistem menu
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SistemMenu extends JFrame implements ActionListener {
    JLabel lblMessage = new JLabel("UTS-Java-2020210092 AKBAR PRIYONO HARYADI");
    Font fntPlain = new Font("Times New Roman", Font.PLAIN, 14);
    Font fntBold = new Font("Sans Serif", Font.BOLD, 14);
    MenuBar mnuMain = new MenuBar();
    Menu mnuFile = new Menu("Menu");
    Menu mnuEdit = new Menu("Edit");
    Menu mnuEditColor = new Menu("Color");
    MenuItem mnuFileExit = new MenuItem("Exit");
    //
    MenuItem mnuAppFaktorial = new MenuItem("Faktorial");
    MenuItem mnuAppCheckBox = new MenuItem("CheckBox");
    MenuItem mnuAppKeyboard = new MenuItem("Keyboard");
    MenuItem mnuAppTimer = new MenuItem("Timer");
    MenuItem mnuAppRadio = new MenuItem("Radio");
    MenuItem mnuJamDigital = new MenuItem("JamDigital");
    MenuItem mnuDaduDigital = new MenuItem("DaduDigital");
    MenuItem mnuAppList = new MenuItem("AlQuran");
    MenuItem mnuAppMouse = new MenuItem("Mouse");
    MenuItem mnuFrameAbstractTable = new MenuItem("FrameAbstractTable");
    MenuItem mnuAppSplit = new MenuItem("Split");
    MenuItem mnuFrameJTable = new MenuItem("FrameJTable");
    MenuItem mnuKamus = new MenuItem("Kamus");

    public static void main(String[] args) {
        // perubahan yang di lakukan adalah mengganti
        // AppMenu myApp = new AppMenu();
        // menjadi
        SistemMenu myApp = new SistemMenu();
        myApp.createInterface();
    }

    public void createInterface() {
        mnuMain.add(mnuFile);
        mnuFile.addActionListener(this);
        //
        mnuFile.add(mnuAppFaktorial);
        mnuFile.add(mnuAppCheckBox);
        mnuFile.add(mnuAppKeyboard);
        mnuFile.add(mnuAppTimer);
        mnuFile.add(mnuAppRadio);

        mnuFile.add(mnuJamDigital);
        mnuFile.add(mnuDaduDigital);
        mnuFile.add(mnuAppList);
        mnuFile.add(mnuFrameAbstractTable);
        mnuFile.add(mnuAppSplit);
        mnuFile.add(mnuFrameJTable);
        mnuFile.add(mnuKamus);
        //
        mnuFile.add(mnuFileExit);
        mnuMain.add(mnuEdit);
        mnuEdit.addActionListener(this);
        mnuEdit.add(mnuEditColor);
        mnuEditColor.addActionListener(this);
        mnuEditColor.add(new MenuItem("Red"));
        mnuEditColor.add(new MenuItem("Green"));
        mnuEditColor.add(new MenuItem("Blue"));
        setMenuBar(mnuMain);
        lblMessage.setFont(fntBold);
        add(lblMessage);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                int Yes = JOptionPane.showConfirmDialog(null, "Benarkah akan KELUAR?", "Keluar",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (Yes == 0)
                    System.exit(0);
            }
        });
        setSize(400, 200);
        setTitle("Sistem menu");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String strMenuItem = event.getActionCommand();

        if (strMenuItem.equals("Red"))
            lblMessage.setForeground(Color.red);
        else if (strMenuItem.equals("Green"))
            lblMessage.setForeground(Color.green);
        else if (strMenuItem.equals("Blue"))
            lblMessage.setForeground(Color.blue);
        else if (strMenuItem.equals("Faktorial"))
            new AppFaktorial();
        else if (strMenuItem.equals("CheckBox"))
            new AppCheckBox();
        else if (strMenuItem.equals("Keyboard"))
            new AppKeyboard();
        else if (strMenuItem.equals("Timer"))
            new AppTimer();
        else if (strMenuItem.equals("Radio"))
            new AppRadio();
        else if (strMenuItem.equals("JamDigital"))
            new JamDigital();
        else if (strMenuItem.equals("DaduDigital"))
            new DaduDigital();
        else if (strMenuItem.equals("AlQuran"))
            new AppList();
        else if (strMenuItem.equals("Mouse"))
            new AppMouse();
        else if (strMenuItem.equals("FrameAbstractTable"))
            new FrameAbstractTable();
        else if (strMenuItem.equals("Split"))
            new AppSplit();
        else if (strMenuItem.equals("FrameJTable"))
            new FrameJTable();
        else if (strMenuItem.equals("Kamus"))
            new Kamus();
        else if (strMenuItem.equals("Exit"))
            System.exit(0);


    }
}

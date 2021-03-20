//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Button1 implements ActionListener {
    StartPage type;
    char[] cCheck;
    char[] cPassword = new char[]{'a', 'd', 'm', 'i', 'n', '\u0000'};
    JFrame f;
    String sCheck;
    String sCheck1 = "admin";

    public Button1(StartPage type) {
        this.type = type;
    }

    public void actionPerformed(ActionEvent e) {
        this.cCheck = this.type.TPPassword.getPassword();
        this.sCheck = this.type.TFUserName.getText();
        if (this.sCheck1.equals(this.sCheck) && this.check()) {
            this.type.PLogin.add(this.type.DomesticFlightBooking);
            this.type.PLogin.add(this.type.InternationalFlightBooking);
            this.type.PLogin.remove(this.type.LUserName);
            this.type.PLogin.remove(this.type.TFUserName);
            this.type.PLogin.remove(this.type.LPassword);
            this.type.PLogin.remove(this.type.TPPassword);
            this.type.PLogin.remove(this.type.BLogin);
            this.type.c.repaint();
        } else {
            JOptionPane.showMessageDialog((Component)null, "Invalid username or password. Try again");
        }

    }

    public boolean check() {
        if (this.cCheck.length < 6 && this.cCheck.length >= 4) {
            for(int i = 0; i <= 4; ++i) {
                if (this.cCheck[i] != this.cPassword[i]) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}

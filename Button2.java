import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

class Button2 implements ActionListener {
    InternationalFlight type;
    StartPage type1;

    Button2(InternationalFlight type, StartPage type1) {
        this.type = type;
        this.type1 = type1;
    }

    public void actionPerformed(ActionEvent e) {
        String sFrom = (String)this.type.CBFrom.getSelectedItem();
        String sTo = (String)this.type.CBTo.getSelectedItem();
        String sClass = (String)this.type.CBClass.getSelectedItem();
        String sBookingDate = this.type.TFBookingDate.getText();
        Integer iPrice = 0;
        String sTime = "";
        Integer iAdult = Integer.parseInt((String)this.type.CBAdult.getSelectedItem());
        int i = 0;
        if (sClass.equals("Economic")) {
            try {
                while(i < 20) {
                    if (this.type1.row2[i][1].equals(sTo)) {
                        sTime = (String)this.type1.row2[i][3];
                        break;
                    }

                    ++i;
                }
            } catch (Exception var23) {
                JOptionPane.showMessageDialog((Component)null, "You have no rights to access");
                System.exit(0);
            }
        } else {
            try {
                while(i < 20) {
                    if (this.type1.row2[i][1].equals(sTo)) {
                        sTime = (String)this.type1.row4[i][3];
                        break;
                    }

                    ++i;
                }
            } catch (Exception var24) {
                JOptionPane.showMessageDialog((Component)null, "You have no rights to access it");
                System.exit(0);
            }
        }

        this.type.setTitle(iPrice + " " + sTime);
        int iCount = 0;
        int iSeatCount = 0;
        String[] sTempFrom = new String[1250];
        String[] sTempTo = new String[1250];
        String[] sTempClass = new String[1250];
        String[] sTempBookingDate = new String[1250];
        String[] sTempTime = new String[1250];
        Integer[] iTempAdult = new Integer[1250];
        Integer[] var18 = new Integer[1250];

        try {
            ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save1"));

            Save1 save1;
            do {
                save1 = (Save1)OIS1.readObject();
                sTempFrom[iCount] = save1.sFrom;
                sTempTo[iCount] = save1.sTo;
                sTempClass[iCount] = save1.sClass;
                sTempBookingDate[iCount] = save1.sBookingDate;
                sTempTime[iCount] = save1.sTime;
                iTempAdult[iCount] = save1.iAdult;
                ++iCount;
                if (save1.sBookingDate.equals(sBookingDate) && save1.sTo.equals(sTo)) {
                    iSeatCount = iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
                }
            } while(save1 != null);

            OIS1.close();
        } catch (Exception var22) {
        }

        iSeatCount += iAdult;
        if (iSeatCount > 60) {
            JOptionPane.showMessageDialog((Component)null, "Seats are full. Sorry!");
        } else {
            int iChoice = JOptionPane.showConfirmDialog((Component)null, "Seats available. Do you want to Book now?");
            if (iChoice == 0) {
                new PrintTicket1(sFrom, sTo, sClass, iAdult, sBookingDate, iPrice, sTime);

                try {
                    ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save1"));

                    for(i = 0; i < iCount; ++i) {
                    }

                    OOS1.close();
                } catch (Exception var21) {
                    System.out.println(var21);
                }
            }
        }

    }
}

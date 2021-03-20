import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

class Button3 implements ActionListener {
    DomesticFlight type;
    StartPage type1;

    Button3(DomesticFlight type, StartPage type1) {
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
        Integer iAdult = Integer.parseInt((String)this.type.CBClient.getSelectedItem());
        int i = 0;
        for( i=0;i<20;i++)
            System.out.println(type1.row1[i][1]);
        if (sClass.equals("Economic")) {
            try {
                while(i < 20) {
                    System.out.println(!this.type1.row1[i][1].equals(sTo));

                    if (this.type1.row1[i][1].equals(sTo)) {
                        iPrice = Integer.parseInt((String) this.type1.row1[i][2]);
                        sTime = (String) this.type1.row1[i][3];
                    }




                }
                ++i;


            } catch (Exception var25) {
                JOptionPane.showMessageDialog((Component) null, "You have no rights to access");
            }}

    int iChoice = JOptionPane.showConfirmDialog((Component)null, "Seats available. Do you want to Book now?");
            if (iChoice == 0) {
        new PrintTicket1(sFrom, sTo, sClass, iAdult, sBookingDate, iPrice, sTime);

    }}}
/*

  else {
            try {
                while(i < 20) {
                    if (this.type1.row1[i][1].equals(sTo)) {
                        iPrice = Integer.parseInt((String)this.type1.row3[i][2]);
                        sTime = (String)this.type1.row3[i][3];
                        break;
                    }

                    ++i;
                }
            } catch (Exception var26) {
                JOptionPane.showMessageDialog((Component)null, "You have no rights to access it");
            }
        }

        this.type.setTitle(iPrice + " " + sTime);
        iPrice = iPrice * iAdult;
        int iCount = 0;
        int iSeatCount = 0;
        String[] sTempFrom = new String[1250];
        String[] sTempTo = new String[1250];
        String[] sTempClass = new String[1250];
        String[] sTempBookingDate = new String[1250];
        String[] sTempTime = new String[1250];
        Integer[] iTempAdult = new Integer[1250];
        Integer[] iTempPrice = new Integer[1250];

        Save2 save2;
        try {
            ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save2"));

            do {
                save2 = (Save2)OIS1.readObject();
                sTempFrom[iCount] = save2.sFrom;
                sTempTo[iCount] = save2.sTo;
                sTempClass[iCount] = save2.sClass;
                sTempBookingDate[iCount] = save2.sBookingDate;
                sTempTime[iCount] = save2.sTime;
                iTempAdult[iCount] = save2.iAdult;
                iTempPrice[iCount] = save2.iPrice;
                ++iCount;
                if (save2.sBookingDate.equals(sBookingDate) && save2.sTo.equals(sTo)) {
                    iSeatCount += save2.iAdult;
                }
            } while(save2 != null);

            OIS1.close();
        } catch (Exception var24) {
        }

        iSeatCount += iAdult;
        if (iSeatCount > 60) {
            JOptionPane.showMessageDialog((Component)null, "Seats are full. Sorry!");
        } else {
            int iChoice = JOptionPane.showConfirmDialog((Component)null, "Seats available. Do you want to Book now?");
            if (iChoice == 0) {
                new PrintTicket1(sFrom, sTo, sClass, iAdult, sBookingDate, iPrice, sTime);

                try {
                    save2 = new Save2(sFrom, sTo, sClass, iAdult, sBookingDate, iPrice, sTime);
                    ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save2"));

                    for(i = 0; i < iCount; ++i) {
                        Save2 temp1 = new Save2(sTempFrom[i], sTempTo[i], sTempClass[i], iTempAdult[i], sTempBookingDate[i], iTempPrice[i], sTempTime[i]);
                        OOS1.writeObject(temp1);
                        System.out.println(temp1);
                    }

                    OOS1.writeObject(save2);
                    OOS1.close();
                } catch (Exception var23) {
                    System.out.println(var23);
                }
            }
        }

    }
}
*/
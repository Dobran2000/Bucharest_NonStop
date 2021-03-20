
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Command1 extends MouseAdapter {
    StartPage type;
    boolean bCheck;

    public Command1(StartPage type, boolean bCheck) {
        this.type = type;
        this.bCheck = bCheck;
    }

    public void mouseEntered(MouseEvent e) {
        this.type.DomesticFlightButton.setCursor(Cursor.getPredefinedCursor(12));
        this.type.InternationalFlightButton.setCursor(Cursor.getPredefinedCursor(12));
    }

    public void mouseClicked(MouseEvent e) {
        if (this.bCheck) {
            this.type.bCheck = true;
        } else {
            this.type.bCheck = false;
        }

        this.type.LEconomic.setVisible(true);
        this.type.LBusiness.setVisible(false);
        this.type.JSP1.setVisible(false);
        this.type.JSP2.setVisible(false);
        this.type.JSP3.setVisible(false);
        this.type.JSP4.setVisible(false);
        if (this.bCheck) {
            this.type.JSP1.setVisible(true);
        } else {
            this.type.JSP2.setVisible(true);
        }

    }
}

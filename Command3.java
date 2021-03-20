
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Command3 extends MouseAdapter {
    StartPage type;
    boolean bCheck;

    public Command3(StartPage type, boolean bCheck) {
        this.type = type;
        this.bCheck = bCheck;
    }

    public void mouseEntered(MouseEvent e) {
        this.type.DomesticFlightBooking.setCursor(Cursor.getPredefinedCursor(12));
        this.type.InternationalFlightBooking.setCursor(Cursor.getPredefinedCursor(12));
    }

    public void mouseClicked(MouseEvent e) {
        if (this.bCheck) {
            new DomesticFlight();
        } else {
            new InternationalFlight(this.type);
        }

    }
}

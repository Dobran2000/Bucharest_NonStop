
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExitListener extends WindowAdapter {
    public ExitListener() {
    }

    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }
}

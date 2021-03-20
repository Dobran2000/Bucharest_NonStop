import javax.swing.UIManager;

class WindowUtilities {
    WindowUtilities() {
    }

    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception var1) {
            System.out.println("Error setting native LAF: " + var1);
        }

    }
}
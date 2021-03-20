import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StartPage extends JFrame {
    Container c = this.getContentPane();
    JPanel PFlightTypes = new JPanel((LayoutManager)null);
    JPanel PLogin = new JPanel((LayoutManager)null);
    JPanel PFlightDetails = new JPanel((LayoutManager)null);
    public boolean bCheck = true;
    JLabel title = new JLabel("<html>\n  <body>\n<font size=+1>Welcome to Bucharest_Airplane</font></body>\n</html> ");
    JLabel LUserName;
    JLabel LPassword;
    JButton DomesticFlightButton = new JButton("DomesticFlight");
    JButton InternationalFlightButton = new JButton("InternationalFlight");
    JButton DomesticFlightBooking = new JButton("Domestic_Booking");
    JButton InternationalFlightBooking = new JButton("International_Booking");
    JTextField TFUserName;
    JPasswordField TPPassword;
    JButton BLogin;
    final Object[] col1 = new Object[]{"Departure", "Destination", "Price", "Time"};
    final Object[] col2 = new Object[]{"Departure", "Destination", "Price", "Time"};
    final Object[] col3 = new Object[]{"Departure", "Destination", "Price", "Time"};
    final Object[][] row1 = new Object[][]{{"Bucharest", "Brasov", "3125", "16:30"},
            {"Bucharest", "Constanta ", "3225", "19:00"},
            {"Bucharest", "Timisoara", "1425 ", "08:30"},
            {"Bucharest", "Targu-Mures", "1025 ", "09:50"},
            {"Bucharest", "Craiova", "1525", "11:00"}, {"Bucharest", "Iasi", "3825 ", "05:30"}, {"Bucharest", "Cluj-Napoca", "3025 ", "05:30"}, {"Bucharest", "Oradea", "1725", "12:00"}, {"Bucharest", "Tulcea", "3725", "19:00"}};
    final Object[][] row2 = new Object[][]{{"Bucharest", "Bali", "21485", "06:20"}, {"Bucharest", "Bangkok", "9000", "20:45"}, {"Bucharest", "Cairo", "22975", "10:25"}, {"Bucharest", "CapeTown", "42500", "16:45"}, {"Bucharest", "Chicago", "35000", "06:30"}, {"Bucharest", "Dubai", "12000", "08:15"}, {"Bucharest", "Frankfurt", "18500", "06:50"}, {"Bucharest", "HongKong", "20845", "12:00"}, {"Bucharest", "Istanbul", "22000", "10:45"}, {"Bucharest", "London", "22600", "14:35"}, {"Bucharest", "LosAngeles", "35000", "22:00"}, {"Bucharest", "Melbourne", "27800", "21:15"}, {"Bucharest", "New York", "32000", "08:50"}, {"Bucharest", "Paris", "18500", "18:45"}, {"Bucharest", "Rome", "19900", "20:00"}, {"Bucharest", "SanFrancisco", "35000", "12:00"}, {"Bucharest", "shanghai", "24430", "10:15"}, {"Bucharest", "Singapore", "9000", "21:10"}, {"Bucharest", "Sydney", "27800", "12:00"}, {"Bucharest", "Toronto", "35000", "17:00 "}};
    final Object[][] row3 = new Object[][]{{"Bucharest", "Brasov", "3125", "16:30"}, {"Bucharest", "Constanta ", "3225", "19:00"}, {"Bucharest", "Timisoara", "1425 ", "08:30"}, {"Bucharest", "Targu-Mures", "1025 ", "09:50"}, {"Bucharest", "Craiova", "1525", "11:00"}, {"Bucharest", "Iasi", "3825 ", "05:30"}, {"Bucharest", "Cluj-Napoca", "3025 ", "05:30"}, {"Bucharest", "Oradea", "1725", "12:00"}, {"Bucharest", "Tulcea", "3725", "19:00"}};
    final Object[][] row4 = new Object[][]{{"Bucharest", "Bali", "64455", "06:20"}, {"Bucharest", "Bangkok", "27000", "20:45"}, {"Bucharest", "Cairo", "68925", "10:25"}, {"Bucharest", "CapeTown", "37500", "16:45"}, {"Bucharest", "Chicago", "105000", "06:30"}, {"Bucharest", "Dubai", "36000", "08:15"}, {"Bucharest", "Frankfurt", "55500", "06:50"}, {"Bucharest", "HongKong", "62535", "12:00"}, {"Bucharest", "Istanbul", "66000", "10:45"}, {"Bucharest", "London", "67800", "14:35"}, {"Bucharest", "LosAngeles", "105000", "22:00"}, {"Bucharest", "Melbourne", "83400", "21:15"}, {"Bucharest", "New York", "96000", "08:50"}, {"Bucharest", "Paris", "55500", "18:45"}, {"Bucharest", "Rome", "59700", "20:00"}, {"Bucharest", "SanFrancisco", "105000", "12:00"}, {"Bucharest", "shanghai", "73290", "10:15"}, {"Bucharest", "Singapore", "27000", "21:10"}, {"Bucharest", "Sydney", "83400", "12:00"}, {"Bucharest", "Toronto", "105000", "17:00"}};
    JTable TDomesticFlight;
    JTable TInternationalFlight;
    JTable TDomesticFlight1;
    JTable TInternationalFlight1;
    JScrollPane JSP1;
    JScrollPane JSP2;
    JScrollPane JSP3;
    JScrollPane JSP4;
    Icon img1;
    Icon img2;
    JLabel LEconomic;
    JLabel LBusiness;

    public StartPage() {
        this.setTitle("WELCOME TO BUCHAREST_AIRPLANE");
        JLabel label99 = new JLabel("WELCOME TO AIRPLANE_BUCHAREST");
        label99.setHorizontalAlignment(2);
        label99.setBounds(130, 10, 400, 100);
        this.add(label99, "Center");
        this.TDomesticFlight = new JTable(this.row1, this.col1);
        this.TInternationalFlight = new JTable(this.row2, this.col2);
        this.TDomesticFlight1 = new JTable(this.row3, this.col3);
        this.TInternationalFlight1 = new JTable(this.row4, this.col2);
        this.JSP1 = new JScrollPane(this.TDomesticFlight, 20, 30);
        this.JSP2 = new JScrollPane(this.TInternationalFlight, 20, 30);
        this.JSP3 = new JScrollPane(this.TDomesticFlight1, 20, 30);
        this.JSP4 = new JScrollPane(this.TInternationalFlight1, 20, 30);
        this.img1 = new ImageIcon("C:\\Users\\Dobran\\4DeDa\\out\\production\\4DeDa\\Avion.jpg");
        this.img2 = new ImageIcon("C:\\Users\\Dobran\\4DeDa\\out\\production\\4DeDa\\MUNTE - Comandă rapidă.lnk");
        this.LEconomic = new JLabel("Economic", this.img1, 0);
        this.LBusiness = new JLabel("Business", this.img2, 10);
        this.setPreferredSize(new Dimension(796, 572));
        this.PFlightTypes.setBackground(Color.white);
        this.PLogin.setBackground(Color.LIGHT_GRAY);
        this.PFlightDetails.setBackground(Color.white);
        this.JSP1.setBounds(0, 340, 790, 200);
        this.JSP2.setBounds(0, 340, 790, 200);
        this.JSP3.setBounds(0, 340, 790, 200);
        this.JSP4.setBounds(0, 340, 790, 200);
        this.PFlightTypes.setBounds(0, 0, 500, 340);
        this.PLogin.setBounds(500, 0, 350, 340);
        this.PFlightDetails.setBounds(0, 340, 790, 200);
        this.LUserName = new JLabel("         User Name ");
        this.LPassword = new JLabel("         Password ");
        this.TFUserName = new JTextField(10);
        this.TPPassword = new JPasswordField(10);
        this.BLogin = new JButton("Sign In");
        this.LUserName.setBounds(40, 100, 100, 21);
        this.LPassword.setBounds(40, 140, 100, 21);
        this.TFUserName.setBounds(160, 100, 100, 21);
        this.TPPassword.setBounds(160, 140, 100, 21);
        this.BLogin.setBounds(160, 200, 100, 25);
        this.DomesticFlightBooking.setBounds(60, 60, 200, 50);
        this.InternationalFlightBooking.setBounds(60, 140, 200, 50);
        this.PLogin.add(this.LUserName);
        this.PLogin.add(this.TFUserName);
        this.PLogin.add(this.LPassword);
        this.PLogin.add(this.TPPassword);
        this.PLogin.add(this.BLogin);
        this.PFlightDetails.add(this.JSP1);
        this.PFlightDetails.add(this.JSP2);
        this.PFlightDetails.add(this.JSP3);
        this.PFlightDetails.add(this.JSP4);
        this.JSP1.setVisible(true);
        this.JSP2.setVisible(false);
        this.JSP3.setVisible(false);
        this.JSP4.setVisible(false);
        this.LEconomic.setBounds(-90, 0, 880, 400);
        this.PFlightTypes.add(this.LEconomic);
        this.LBusiness.setVisible(false);
        this.LEconomic.setVisible(true);
        this.DomesticFlightButton.setBounds(10, 100, 210, 25);
        this.InternationalFlightButton.setBounds(240, 100, 200, 25);
        this.c.add(this.PFlightTypes);
        this.c.add(this.PLogin);
        this.c.add(this.PFlightDetails);
        this.PFlightTypes.add(this.DomesticFlightButton);
        this.PFlightTypes.add(this.InternationalFlightButton);
        this.pack();
        this.setVisible(true);
        this.addWindowListener(new ExitListener());
        this.DomesticFlightButton.addMouseListener(new Command1(this, true));
        this.InternationalFlightButton.addMouseListener(new Command1(this, false));
        this.DomesticFlightBooking.addMouseListener(new Command3(this, true));
        this.InternationalFlightBooking.addMouseListener(new Command3(this, false));
        this.BLogin.addActionListener(new Button1(this));
    }

    public static void main(String[] args) {
        new StartPage();
    }
}

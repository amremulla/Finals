import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Receipt extends JFrame{

   JTextField food,quantity;
   String[] columnNames = {"Food Name","Quantity","Price"};
   JTable cart;
   JLabel Total = new JLabel("TOTAL PRICE : 0.0tk");
   JLabel TotalP  = new JLabel();
   Object data[][] = new Object[100][3];
   int T = 0;
   double totalprice = 0;
    ArrayList<foodCart> MENU = new ArrayList<>();

   Receipt(){
       JPanel JPA = new JPanel();
       setBackground(Color.WHITE);
       JPA.setBackground(Color.RED);
		 
       this.setLayout(new GridLayout(2,2));
	   
       JLabel a = new JLabel("Food Name : ");
       JPA.add(a);
       food = new JTextField(50);
       JPA.add(food);
       JLabel b = new JLabel("Quantity : ");
       JPA.add(b);
       quantity = new JTextField(50);
       JPA.add(quantity);

       JButton ok = new JButton("OK");

       JPanel JPB = new JPanel();
       JPB.setSize(700, 400);
       JPA.add(ok);
       ok.addActionListener(new ActionListener() {
         @Override
public void actionPerformed(ActionEvent e) {
            PreparedStatement pst;
            DataBase con = new DataBase();
            ResultSet rs;
            try{
                pst = con.mkDataBase().prepareStatement("select f_prize from canteenmanagement.food where f_name = ?");
                pst.setString(1, food.getText());
                rs = pst.executeQuery();

                while (rs.next()){
                    foodCart f = new foodCart();
                    f.name = food.getText();
                    f.quantity = Integer.parseInt(quantity.getText());
                    f.totalPer = f.quantity*rs.getDouble("f_prize");
                    totalprice += f.quantity*rs.getDouble("f_prize");

                    MENU.add(f);
                    data[T][0] = f.name;
                    data[T][1] = Integer.parseInt(quantity.getText());
                    data[T][2] = f.quantity*rs.getDouble("f_prize");
                    T++;
                    food.setText("");
                    quantity.setText("");
                    DefaultTableModel model = (DefaultTableModel) cart.getModel();
                    model.setRowCount(0);
                    cart = new JTable(data, columnNames);
                    System.out.println(totalprice);
                    removeAll();
                    
                    Total.setText("TOTAL Price : " + Double.toString(totalprice) + "");
                    Total.revalidate();
                    Total.repaint();
                    revalidate();
                    repaint();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
         }
      });
       cart = new JTable(data, columnNames);
       cart.setSize(300, 450);
       //cart.setEnabled(false);
//       jp2.setLayout(new GridLayout(1,1));
       JPB.setLayout(new FlowLayout());
       JPB.add(Total);
       JPB.add(new JScrollPane(cart, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
       
       JButton checkOut = new JButton("CheckOut");
       checkOut.setSize(40, 50);
       JPB.add(checkOut);
       checkOut.addActionListener(new ActionListener() {
         
    @Override
    public void actionPerformed(ActionEvent e) {
            int count = 1;
            for(foodCart fc : MENU){
                System.out.println(count + ": Food Name : " + fc.name + " Quantity : "+ fc.quantity + " Price : " + fc.totalPer + "");

            }
            double vat = 15;
            System.out.println("Total Cost : " + (totalprice+totalprice*vat) + "");

            JOptionPane.showMessageDialog(null, "Total Cost : " + (totalprice+totalprice*vat/100) + "with vat " + vat+"%");
            hide();
         }
      });
        
       this.add(JPA);
       this.add(JPB);
       this.setSize(600,550);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
   }
class foodCart{
    String name;
    Double totalPer;
    int quantity;
}

}
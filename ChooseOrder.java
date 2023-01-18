import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChooseOrder {

   private JFrame MainF;
   private JLabel HLabel;
   private JPanel CPanel;
   private JLabel user,name,price,quantity;
   private static int num = 0;
   GridLayout experimentLayout = new GridLayout(0,2);
   ResultSet rs;

    ChooseOrder(){
    prepareGUI();
   }
   public static void main(String[] args){
    ChooseOrder  swingControlDemo = new ChooseOrder ();
    swingControlDemo.showButtonDemo();
   }
   private void prepareGUI(){
    MainF = new JFrame("Insert a new menuMainF!");
    MainF.setSize(700,400);
    MainF.setLayout(new GridLayout(3, 1));
    MainF.getContentPane().setBackground(Color.gray);
    MainF.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent windowEvent){
    MainF.setVisible(false);
         }
      });
    HLabel = new JLabel("", JLabel.CENTER);

    CPanel = new JPanel();
    CPanel.setLayout(new FlowLayout());

    MainF.add(HLabel);
    MainF.add(CPanel);
    MainF.setVisible(true);
   }
   public void showButtonDemo(){
    HLabel.setText("Restaurant");
    HLabel.setFont(new Font(null, Font.BOLD, 27));

    name = new JLabel("Enter Name");
    JTextField JTN = new JTextField();
    JTN.setSize(100,40);

    price = new JLabel("Enter Price");
    JTextField JTP=new JTextField();
    JTP.setSize(100,40);

    quantity = new JLabel("Enter Quantity");
    JTextField JTQ=new JTextField();
    JTQ.setSize(100,40);

    JButton okButton = new JButton("OK");
    okButton.addActionListener(new ActionListener() {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        PreparedStatement pst;
            
    DataBase con = new DataBase();
    try{
        pst = con.mkDataBase().prepareStatement("insert into canteenmanagement.food(f_name,f_prize,f_quantity) values (?,?,?)");
        pst.setString(1, JTN.getText());
        pst.setDouble(2, Double.parseDouble(JTP.getText()));
        pst.setInt(3, Integer.parseInt(JTQ.getText()));
        pst.execute();

        JOptionPane.showMessageDialog(null, "Done Inserting " + JTN.getText());
        MainF.setVisible(false);
    }
    catch(Exception ex){
        System.out.println(ex);
        System.out.println("EEEE");
        JOptionPane.showMessageDialog(null, "Inserting Error : " + JTN.getText());
    }
    finally{
            }
         }
      });
      
      JPanel jp = new JPanel(null);
      jp.add(name);
      jp.add(JTN);
      jp.add(price);
      jp.add(JTP);
      jp.add(quantity);
      jp.add(JTQ);

      jp.setSize(500,500);
      jp.setLayout(experimentLayout);
      CPanel.add(jp);
      jp.add(okButton);
		

      MainF.setLocationRelativeTo(null);
      MainF.setVisible(true);
   }
}
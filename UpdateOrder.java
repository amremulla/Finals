import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateOrder {

   private JFrame MainF;
   private JLabel HLabel;
   private JLabel SLabel;
   private JPanel CPanel;
   private JLabel user,name,price,quantity;
   private static int num = 0;
   GridLayout experimentLayout = new GridLayout(0,2);
    ResultSet rs;

    UpdateOrder(){


      prepareGUI();
   }

   public static void main(String[] args){
      UpdateOrder  swingControlDemo = new UpdateOrder();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI(){
      MainF = new JFrame("Update!");
      MainF.setSize(700,400);
      MainF.setLayout(new GridLayout(3, 1));
        
      MainF.getContentPane().setBackground(Color.WHITE);
      MainF.addWindowListener(new WindowAdapter() {
    
    @Override
    public void windowClosing(WindowEvent windowEvent){
            MainF.setVisible(false);
         }
      });
      HLabel = new JLabel("", JLabel.CENTER);
      SLabel = new JLabel("",JLabel.CENTER);

      SLabel.setSize(350,400);

      CPanel = new JPanel();
      CPanel.setLayout(new FlowLayout());

      MainF.add(HLabel);
      MainF.add(CPanel);
      MainF.add(SLabel);
      MainF.setVisible(true);
   }


   public void showButtonDemo(){

      HLabel.setText("RESTAURANT");
      HLabel.setFont(new Font(null, Font.BOLD, 27));
	
      name = new JLabel("Enter Name");
      JTextField JTN = new JTextField();
      JTN.setSize(100,30);
        
      price = new JLabel("Enter Price");
      JTextField JTP = new JTextField();
      JTP.setSize(100,30);

      quantity = new JLabel("Enter Quantity");
      JTextField JTQ = new JTextField();
      JTQ.setSize(100,30);

      JButton UpdateB = new JButton("UPDATE");


      UpdateB.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        PreparedStatement pst;
        DataBase con = new DataBase();
            try{
                pst = con.mkDataBase().prepareStatement("UPDATE restaurant.food SET f_quantity= ?, f_prize=? where f_name = ?");
                pst.setString(3, JTN.getText());
                pst.setDouble(2, Double.parseDouble(JTP.getText()));
                pst.setInt(1, Integer.parseInt(JTQ.getText()));
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Done" + JTN.getText());
                MainF.setVisible(false);
                
            }catch(Exception ex){
                System.out.println(ex);
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Inserting Error : " + JTN.getText());
            }finally{
                
            }
         }
      });

      JPanel jp = new JPanel();
      jp.add(name);
      jp.add(JTN);
      jp.add(price);
      jp.add(JTP);
      jp.add(quantity);
      jp.add(JTQ);
      
      jp.setSize(200,200);
      jp.setLayout(experimentLayout);
      CPanel.add(jp);
      jp.add(UpdateB);

      MainF.setVisible(true);
      MainF.setLocationRelativeTo(null);
 
    }
}
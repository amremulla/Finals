import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveOrder {
   private JFrame MainF;
   private JLabel HLabel;
   private JPanel CPanel;
   private JLabel user,name,price,quantity;
   private static int num = 0;
   GridLayout experimentLayout = new GridLayout(1,1);
   ResultSet rs;

    RemoveOrder(){
    prepareGUI();
   }

public static void main(String[] args){
    RemoveOrder  swingControlDemo = new RemoveOrder();
      swingControlDemo.showButtonDemo();
   }
private void prepareGUI(){
      MainF = new JFrame("Delete!");
      MainF.setSize(700,400);
      MainF.getContentPane().setBackground(Color.gray);
      MainF.setLayout(new GridLayout(3, 1));
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
      HLabel.setText("RESTAURANT");
      HLabel.setFont(new Font(null, Font.BOLD, 27));
      HLabel.setForeground(Color.white);
  
      name = new JLabel("Enter Name");
      JTextField JTN=new JTextField();
      JTN.setSize(100,30);
        
      JButton okButton = new JButton("DELETE");

      okButton.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent e) {
        PreparedStatement pst;
        DataBase con = new DataBase();
    try{
        pst = con.mkDataBase().prepareStatement("DELETE FROM canteenmanagement.food where f_name = ?");
        pst.setString(1,JTN.getText());
				
        pst.execute();
                
        JOptionPane.showMessageDialog(null, "Item Deleted " + JTN.getText());
        MainF.setVisible(false);
                
            }
    catch(Exception ex){
        System.out.println(ex);
        System.out.println("EEEE");
        JOptionPane.showMessageDialog(null, "Item not found : " + JTN.getText());
        }
        finally{
                
            }
         }
      });

      JPanel jp = new JPanel();
      jp.add(name);
      jp.add(JTN);
      jp.setSize(700,400);
      jp.setLayout(experimentLayout);
      CPanel.add(jp);
      jp.add(okButton);
    
      MainF.setVisible(true);
      MainF.setLocationRelativeTo(null);
   }
}
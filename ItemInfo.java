import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class ItemInfo {

   private JFrame MainF;
   private JLabel HLabel;
   private JLabel SLabel;
   private JPanel CPanel;

    ItemInfo (){


      prepareGUI();
   }

   public static void main(String[] args) throws SQLException{
      ItemInfo  swingControlDemo = new ItemInfo();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI(){
      MainF = new JFrame("Menu");
      MainF.setSize(700,400);
      MainF.getContentPane().setBackground(Color.lightGray);
      MainF.setLayout(new GridLayout(4, 1));
      MainF.setLayout(new FlowLayout());
      MainF.addWindowListener(new WindowAdapter() {
   
    @Override
    public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
         }
      });
      HLabel = new JLabel("", JLabel.CENTER);
      SLabel = new JLabel("",JLabel.CENTER);
      SLabel.setSize(450,200);

      CPanel = new JPanel();
      CPanel.setSize(700,400);
      CPanel.setLayout(new FlowLayout());

      MainF.add(HLabel);
      MainF.add(CPanel);
      MainF.add(SLabel);
      MainF.setVisible(true);
   }


   public void showButtonDemo() throws SQLException{

      HLabel.setText("RESTAURANT");
      HLabel.setFont(new Font(null, Font.BOLD, 25));

      String[] columnNames = {"Username","Food Name","Price","Quantity"};
      Object[][] data = new Object[100][4];
      
     PreparedStatement pst;
       ResultSet rs;
            DataBase con = new DataBase();
            try{
                pst = con.mkDataBase().prepareStatement("select * from restaurant.food");
                
                rs = pst.executeQuery();
                int i=0;
                while(rs.next()){
                    data[i][0] = rs.getInt("f_id");
                    data[i][1] = rs.getString("f_name");
                    data[i][2] = rs.getDouble("f_prize");
                    data[i][3] =  rs.getInt("f_quantity");
                    i++;
                }
                MainF.setVisible(false);
                
            }
            catch(Exception ex){
                System.out.println(ex);
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Error !");
            }

        JTable Jtable = new JTable(data, columnNames);
        Jtable.setSize(400, 400);
        Jtable.setVisible(true);
	Jtable.setEnabled(false);
        CPanel.add(new JScrollPane(Jtable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        CPanel.add(Jtable);

      MainF.setVisible(true);
	  
	  MainF.setLocationRelativeTo(null);
   }
}
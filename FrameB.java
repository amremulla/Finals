import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;

public class FrameB {

   private JFrame MainF;
   private JLabel HLabel;
   private JLabel SLabel;
   private JPanel CPanel;
   

   public FrameB(){
     prepareGUI();		
   }

   public static void main(String[] args){
      FrameB  swingControlDemo = new FrameB();
      swingControlDemo.showButtonDemo();	  
   }

   private void prepareGUI(){
      MainF = new JFrame("Restaurant Management System ");
      MainF.setBounds(100,100,700,400);
      MainF.setLayout(new GridLayout(3,1));
      MainF.getContentPane().setBackground(Color.orange);  
      MainF.addWindowListener(new WindowAdapter() {
         @Override
    public void windowClosing(WindowEvent windowEvent){
            System.exit(0);	
         }
      });
      HLabel = new JLabel("", JLabel.CENTER);
      SLabel = new JLabel("",JLabel.CENTER);

      SLabel.setSize(350,300);

      CPanel = new JPanel();
      CPanel.setLayout(new GridLayout(1,5));
	  
	 
      MainF.add(HLabel);
      MainF.add(CPanel);
      MainF.add(HLabel);
      MainF.setVisible(true);
	 
   }


   public void showButtonDemo(){
      HLabel.setText("RESTAURANT");
      this.HLabel.setFont(new Font(null, Font.BOLD, 27));
      HLabel.setForeground(Color.white);
	JButton fkButton = new JButton("Food Info");
	JButton billButton = new JButton("Billing Info");
	JButton afButton = new JButton("Insert Item");
	JButton ufButton = new JButton("Update Item");
		
	JButton dlButton = new JButton("Delete Item");
        fkButton.addActionListener(new ActionListener()
{
    @Override
    public void actionPerformed(ActionEvent e) {
           ItemInfo IF = new ItemInfo();
        try {
            IF.showButtonDemo();
        } catch (SQLException ex) {
            Logger.getLogger(FrameB.class.getName()).log(Level.SEVERE, null, ex);
        }

         }
});	
        billButton.addActionListener(new ActionListener() {
         @Override
    public void actionPerformed(ActionEvent e)
{
        Receipt r = new Receipt();}

});
        afButton.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e)
{        
        ChooseOrder c = new ChooseOrder();
        c.showButtonDemo();
         }
});
        ufButton.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {          
        UpdateOrder u = new UpdateOrder();
        u.showButtonDemo();
         }
});
        dlButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        RemoveOrder ro = new RemoveOrder();
            ro.showButtonDemo();
         }
});
        CPanel.add(ufButton);
        CPanel.add(afButton);
	CPanel.add(billButton);
        CPanel.add(fkButton);
	CPanel.add(dlButton);
        
        MainF.setVisible(true);
	MainF.setLocationRelativeTo(null);
	  
   }
 
}
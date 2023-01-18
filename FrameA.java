import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;


public class FrameA extends JFrame{

    JLabel ULabel;
    JLabel PLabel;
    JLabel background;
    JLabel headerLabel;
    JLabel Info;
	
    JTextField user;
    JPasswordField pass;

    JButton submit;


   public FrameA(){
	setTitle("Restaurant Management System");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
        
	this.background = new JLabel(new ImageIcon("C:\\Users\\Andreiana Mae\\Pictures\\Background\\BurgerPhoto.jpg"));
        this.init();
        add(background);
	
        background.setVisible(true); 
        this.pack();
	this.setSize(700,400);
	this.setLocationRelativeTo(null);
    }
    public void init(){
	headerLabel = new JLabel();
	this.headerLabel.setText("RESTAURANT");
	this.headerLabel.setBounds(270,1,200,100);
	this.headerLabel.setFont(new Font("Geomanist", Font.BOLD, 25));
	headerLabel.setForeground(Color.GRAY);
	add(headerLabel);
		
	ULabel = new JLabel();
	this.ULabel.setText("Username");
	this.ULabel.setBounds(190,110,100,50);
	this.ULabel.setFont(new Font(null, Font.BOLD, 20));
	ULabel.setForeground(Color.white);
	add(ULabel);
		
        PLabel = new JLabel("Password");
	this.PLabel.setBounds(190,165,100,50);
	this.PLabel.setFont(new Font(null, Font.BOLD, 20));
	PLabel.setForeground(Color.white);
	add(PLabel);
		
	Info = new JLabel();
	this.Info.setText("ALL RIGHTS RESERVED");
	this.Info.setBounds(130,300,1000,30);
	this.Info.setFont(new Font("Geomanist", Font.PLAIN, 15));
	Info.setForeground(Color.white);
	add(Info);
			
			
        user = new JTextField();
        this.user.setBounds(300,125,200,30);
        add(user);
		
	pass = new JPasswordField();
	this.add(pass);
	this.pass.setBounds(300,175,200,30);
	
        this.user.setVisible(true);

        this.submit=new JButton("Login");
        this.submit.setBounds(400,230,100,25);
	add(submit);
	   
       submit.addActionListener(this::submitActionPerformed);
   } 
   public void submitActionPerformed(java.awt.event.ActionEvent evt){
        if(user.getText().equals("Admin123") && pass.getText().equals("admin")){
        this.hide();
        FrameB F =new FrameB();
        F.showButtonDemo();
   }
   else{
    JOptionPane.showMessageDialog(null, "Invalid password!");
   }
   }
}
class MyGui{
	public static void main(String[] a){
		FrameA f = new FrameA();
		f.setVisible(true);
		
	}
}
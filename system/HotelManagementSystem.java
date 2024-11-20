package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem (){
    
    setBounds(0,0,1300,700);
    setLayout(null);
    
    ImageIcon ii=new ImageIcon(ClassLoader.getSystemResource("icons/frist.jpg"));
    Image i2=ii.getImage().getScaledInstance(1300,700,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3) ;
      image.setBounds(0,0,1300,700);
      add(image);
      
      JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
      text.setBounds(400,0,1500,90);
      text.setForeground(Color.black);
      text.setFont(new Font("serif",Font.PLAIN,30));
      image.add(text);
      
      JButton next =new JButton("login");
      next.setBounds(1130,600,135,40);
      next.addActionListener(this);
      next.setFont(new Font("serif",Font.PLAIN,35));
      image.add(next);
      
    setVisible(true);
    
 while(true){
                        text.setVisible(false);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){} 
                        text.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
            
       public void actionPerformed(ActionEvent ae){
                setVisible(false);
                new Login();}
               
        

    
    public static void main(String[] args) {
          HotelManagementSystem bb =new HotelManagementSystem();
    }
    
}




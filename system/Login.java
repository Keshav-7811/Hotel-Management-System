
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
      JTextField t1;
      JPasswordField t2;
      JButton login,cancel,forget;
    
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        
        JLabel l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
        
        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setFont(new Font("serif",Font.BOLD,15));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setFont(new Font("serif",Font.BOLD,15));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
         forget = new JButton("Forget Password");
        forget.setBounds(100,180,150,30);
        forget.setFont(new Font("serif",Font.BOLD,15));
        forget.setBackground(Color.BLACK);
        forget.setForeground(Color.WHITE);
        forget.addActionListener(this);
        add(forget);

        
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);


        
        
        
        setBounds(500,200,600,300);
        setVisible(true);
                
      }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==login){
            String user =t1.getText();
            String pass =t2.getText();
            
            try{
                
                conn c=new conn();
                String query="select * from login  where username= '"+user +"'and password='"+pass+"'";
                
             ResultSet rs= c.s.executeQuery(query);
             
             if(rs.next()){
                 setVisible(false);
                 new Dashboard();
              
             }else{
             JOptionPane.showMessageDialog(null,"invalid username or password");
             setVisible(false);
             
             }
             
            
            
            }catch (Exception e){
                e.printStackTrace();
                
            }
            
            
        
        }else if(ae.getSource()==cancel){
            setVisible(false);
        
        }
        
    }
    public static void main(String[] args){
    
    new Login();
    }
    
}


package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public  class Pickup extends JFrame implements ActionListener {
    JTable table;
    JButton back,submit;
    Choice typeofcar;
    JCheckBox available; 
    Pickup(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
                
        
         JLabel text=new JLabel("Pickup Service");
         text.setFont(new Font("Tahoma",Font.PLAIN,20));
         text.setBounds(400, 30, 200, 30);
         add(text);
         
         
         JLabel lblbed=new JLabel("Type Of Car");
         lblbed.setBounds(50, 100, 100, 20);
         add(lblbed);
         
         typeofcar=new Choice();
         typeofcar.setBounds(150,100,200,25);
         add(typeofcar);
         
         
         try{
         conn c=new conn();
         ResultSet rs=c.s.executeQuery("select * from driver");
         while(rs.next()){
          typeofcar.add(rs.getString("company"));
         }
         
         
         
         }catch(Exception e){
           
             e.printStackTrace();
         
         }
         
        
         
         
        
        JLabel l1=new JLabel("Name");
        l1.setBounds(30,160,100,20);
        add(l1);
        
        
        JLabel l2=new JLabel("age");
        l2.setBounds(200,160,100,20);
        add(l2);
        
        
        JLabel l3=new JLabel("gender");
        l3.setBounds(350,160,100,20);
        add(l3);
        
         JLabel l4=new JLabel("company");
        l4.setBounds(520,160,100,20);
        add(l4);
        
        
        JLabel l5=new JLabel("Brand");
        l5.setBounds(680,160,100,20);
        add(l5);
        
                 
         JLabel l7=new JLabel("Location");
        l7.setBounds(870,160,100,20);
        add(l7);

        
        

                
                
        
        
        
        table =new JTable();
        table.setBounds(0,200,1000,300);
        add(table);
        
        
        
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select *from driver");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        
        }catch(Exception e){
            e.printStackTrace();
        
        
        }
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(500,520,120,30);
        back.addActionListener(this);
        add(back);
        
         submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(300,520,120,30);
        submit.addActionListener(this);
        add(submit);
         
        
        setBounds(200,50,1000,600);
        setVisible(true);
    
    }
    
   public void actionPerformed(ActionEvent ae){
   
       if(ae.getSource()==submit){
           
           try{
               
              String query="select * from driver where company='"+typeofcar.getSelectedItem()+"'";
               
               conn conn=new conn();
               ResultSet rs;
               rs=conn.s.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(rs));
           
           }catch(Exception e){
               e.printStackTrace();
           
           
           }
       
       }else{
       setVisible(false);
         new Reception();
       }
       
    
    }
  public static void main(String[] args) {
  
      new Pickup();
  
  }         

   
}

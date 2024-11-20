 
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddDriver extends JFrame implements ActionListener {
    JTextField tfname,tfage,tfcompany,tfmodel,tflocation;
    JComboBox typecombo, availablecombo, cleancombo,gendercombo;
    JButton add,cancel;
   
    
    
    
    AddDriver(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
	heading.setBounds(150, 20, 200, 20);
	add(heading);
        
        JLabel lblroomno = new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblroomno.setBounds(60, 80, 120, 30);
	add(lblroomno);
        
           tfname = new JTextField();
	tfname.setBounds(200, 80, 150, 30);
	add(tfname);
        
         
        JLabel lblage= new JLabel("Age");
        lblage.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblage.setBounds(60, 130, 120, 30);
	add(lblage);
        
         tfage = new JTextField();
	tfage.setBounds(200, 130, 150, 30);
	add(tfage);
        
         JLabel lblclean= new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblclean.setBounds(60, 180, 120, 30);
	add(lblclean);
        
        
         
        String cleanOptions[]={"Male","Female"};
         gendercombo=new JComboBox(cleanOptions);
        gendercombo.setBounds(200,180,150,30);
        gendercombo.setBackground(Color.white);
        add(gendercombo);
        
         JLabel lblprice = new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblprice.setBounds(60, 230, 120, 30);
	add(lblprice);
        
           tfcompany= new JTextField();
	tfcompany.setBounds(200, 230, 150, 30);
	add(tfcompany);
        
         JLabel lbltype= new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lbltype.setBounds(60, 280, 120, 30);
	add(lbltype);
        
        tfmodel= new JTextField();
	tfmodel.setBounds(200, 280, 150, 30);
	 add(tfmodel);
         
         JLabel lbllocation= new JLabel("Location");
        lbllocation.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lbllocation.setBounds(60, 330, 120, 30);
	add(lbllocation);
        
        tflocation= new JTextField();
	tflocation.setBounds(200, 330, 150, 30);
	 add(tflocation);
        
        
         add= new JButton("Add Driver");
	add.setBounds(60, 380, 130, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
	add(add);
        
        
         cancel= new JButton("CANCEL");
	cancel.setBounds(220, 380, 130, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
         cancel.addActionListener(this);
	add(cancel);
        
         ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/car.jpg"));
         JLabel image=new JLabel(i1);
         image.setBounds(400,30,500,370);
         add(image);
        
        

        
        
        
        setBounds(200,150,940,470);
        setVisible(true);
        
    
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==add){
            String name=tfname.getText();
            String age=tfage.getText();
            String gender=(String)gendercombo.getSelectedItem();
            String company =tfcompany.getText();
            String model=tfmodel.getText();
            String location=tflocation.getText();
            
            try{
                conn conn=new conn();
                String str="INSERT INTO driver values( '"+name+"', '"+age+"', '"+gender+"','"+company+"', '"+model+"','"+location+"')";
                
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"new driver added succefully");
                setVisible(false);
            
            
            } catch(Exception e){
            e.printStackTrace();
            }
            
        
        
        
        }else{
            
            setVisible(false);
        
        }
        
    
    
    
    }
    
    
    public static void main(String[]args){
    
    new AddDriver();
    }
   
    
}

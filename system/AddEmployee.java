
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java .awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    JTextField tfname,tfemail,tfphone,tfage,tfsalary,tfaadhar;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    
    AddEmployee(){
        setLayout(null);
        
        JLabel lbl = new JLabel("NAME");
           lbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lbl.setBounds(60, 30, 150, 27);
           add(lbl);
           
            tfname = new JTextField();
            tfname.setBounds(200, 30, 150, 27);
            add(tfname);
           
           
            JLabel lblage = new JLabel("AGE");
           lblage.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lblage.setBounds(60,77 , 150, 27);
           add(lblage);
           
            tfage = new JTextField();
            tfage.setBounds(200, 77, 150, 27);
            add(tfage);
            
            
            JLabel lblgener = new JLabel("GENDER");
           lblgener.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lblgener.setBounds(60,124 , 150, 27);
           add(lblgener);
           
           
             rbmale= new JRadioButton("MALE");
            rbmale.setFont(new Font("tahoma",Font.PLAIN,14));
            rbmale.setBackground(Color.WHITE);
            rbmale.setBounds(200, 124, 70, 27);
            add(rbmale);
            
             rbfemale= new JRadioButton("FEMALE");
            rbfemale.setFont(new Font("tahoma",Font.PLAIN,14));
            rbfemale.setBackground(Color.WHITE);
            rbfemale.setBounds(280, 124, 75, 27);
            add(rbfemale);
            
            
            ButtonGroup bg=new ButtonGroup();
            bg.add(rbmale);
            bg.add(rbfemale);
            
             JLabel lbljob = new JLabel("JOB");
           lbljob.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lbljob.setBounds(60,171 , 150, 27);
           add(lbljob);
           
           String str[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
             cbjob = new JComboBox(str);
            cbjob.setBackground(Color.WHITE);
            cbjob.setBounds(200,170,150,30);
            add(cbjob);
            
            
            
            JLabel lblsalary = new JLabel("SALARY");
           lblsalary.setFont(new Font("Tahoma", Font.PLAIN, 17));
           lblsalary.setBounds(60, 220, 150, 27);
           add(lblsalary);
           
            tfsalary = new JTextField();
            tfsalary.setBounds(200, 220, 150, 27);
            add(tfsalary);
            
            JLabel lblphone = new JLabel("PHONE");
            lblphone.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblphone.setBounds(60, 270, 150, 27);
            add(lblphone);
      
             tfphone = new JTextField();
            tfphone.setBounds(200, 270, 150, 27);
            add(tfphone);
            
            
            
            
            
             JLabel lblemail = new JLabel("EMAIL");
            lblemail.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblemail.setBounds(60, 320, 150, 27);
            add(lblemail);
			
             tfemail = new JTextField();
             tfemail.setBounds(200, 320, 150, 27);
            add( tfemail);
            
            
            JLabel lblaadhar = new JLabel("AADHAR");
            lblaadhar.setFont(new Font("Tahoma", Font.PLAIN, 17));
            lblaadhar.setBounds(60, 370, 150, 27);
            add(lblaadhar);
			
             tfaadhar = new JTextField();
             tfaadhar.setBounds(200, 370, 150, 27);
            add(tfaadhar);
            
            
              submit= new JButton("SUBMIT");
            submit.setFont(new Font("tahoma",Font.PLAIN,14));
            submit.setBackground(Color.BLACK);
             submit.setForeground(Color.WHITE);
            submit.setBounds(200, 410, 150, 27);
            submit.addActionListener(this);
            add(submit);
            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/five.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(370,80,480,410);
            add(image);
            
	
	
           
           
         
            
            
        getContentPane().setBackground(Color.white);
        setBounds(300,130,850,540);
        setVisible(true);
    }
    
    
    
    
      public void actionPerformed(ActionEvent ae){
          String name = tfname.getText();
                    String age = tfage.getText();
                    String salary = tfsalary.getText();
                    String phone = tfphone.getText();
                    String aadhar = tfaadhar.getText();
                    String email = tfemail.getText();
                    
               
                    String gender = null;
                    
                    if(rbmale.isSelected()){
                        gender = "male";
                    
                    }else if(rbfemale.isSelected()){
                        gender = "female";
                    }
                    
                    
                    String job = (String)cbjob.getSelectedItem();
                    
                     try {
                        conn conn = new conn();
                        String query = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+job+"', '"+salary+"', '"+phone+"','"+email+"', '"+aadhar+"')";
                        
                        conn.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Employee Added successfully");
                        setVisible(false);
                    
                       
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
          
			
         
    
    public static void main(String[] args){
        new AddEmployee();
    }   
    
}

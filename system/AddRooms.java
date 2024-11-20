 
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddRooms extends JFrame implements ActionListener {
    JTextField tfroom,tfprice;
    JComboBox typecombo, availablecombo, cleancombo;
    JButton add,cancel;
   
    
    
    
    AddRooms(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Rooms");
        heading.setFont(new Font("Tahoma", Font.BOLD, 18));
	heading.setBounds(150, 20, 200, 20);
	add(heading);
        
        JLabel lblroomno = new JLabel("Room Number");
        lblroomno.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblroomno.setBounds(60, 80, 120, 30);
	add(lblroomno);
        
           tfroom = new JTextField();
	tfroom.setBounds(200, 80, 150, 30);
	add(tfroom);
        
         
        JLabel lblavailable= new JLabel("AVAILABLE");
        lblavailable.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblavailable.setBounds(60, 130, 120, 30);
	add(lblavailable);
        
        String availableOptions[]={"Available","Occupied"};
         availablecombo=new JComboBox(availableOptions);
        availablecombo.setBounds(200,130,150,30);
        availablecombo.setBackground(Color.white);
        add(availablecombo);
        
         JLabel lblclean= new JLabel("Cleaning status");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblclean.setBounds(60, 180, 120, 30);
	add(lblclean);
        
        
         
        String cleanOptions[]={"Cleaned","Dirty"};
         cleancombo=new JComboBox(cleanOptions);
        cleancombo.setBounds(200,180,150,30);
        cleancombo.setBackground(Color.white);
        add(cleancombo);
        
         JLabel lblprice = new JLabel("PRICE");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblprice.setBounds(60, 230, 120, 30);
	add(lblprice);
        
           tfprice= new JTextField();
	tfprice.setBounds(200, 230, 150, 30);
	add(tfprice);
        
         JLabel lbltype= new JLabel("bed type");
        lbltype.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lbltype.setBounds(60, 280, 120, 30);
	add(lbltype);
        
        
         
        String typeOptions[]={"single bed","double bed"};
         typecombo=new JComboBox(typeOptions);
        typecombo.setBounds(200,280,150,30);
        typecombo.setBackground(Color.white);
        add(typecombo);
        
         add= new JButton("Add ROOM");
	add.setBounds(60, 350, 130, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
	add(add);
        
        
         cancel= new JButton("CANCEL");
	cancel.setBounds(220, 350, 130, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
         cancel.addActionListener(this);
	add(cancel);
        
         ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/room.png"));
         JLabel image=new JLabel(i1);
         image.setBounds(400,30,500,370);
         add(image);
        
        

        
        
        
        setBounds(200,150,940,470);
        setVisible(true);
        
    
    
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==add){
            String roomnumber=tfroom.getText();
            String availablity=(String)availablecombo.getSelectedItem();
            String status=(String)cleancombo.getSelectedItem();
            String price =tfprice.getText();
            String type=(String)typecombo.getSelectedItem();
            
            try{
                conn conn=new conn();
                String str="INSERT INTO room values( '"+roomnumber+"', '"+availablity+"', '"+status+"','"+price+"', '"+type+"')";
                
                conn.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"new room added succefully");
                setVisible(false);
            
            
            } catch(Exception e){
            e.printStackTrace();
            }
            
        
        
        
        }else{
            
            setVisible(false);
        
        }
        
    
    
    
    }
    
    
    public static void main(String[]args){
    
    new AddRooms();
    }
   
    
}

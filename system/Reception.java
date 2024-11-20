
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
       JButton newcustomer,room,department,allemployee,managerinfo,customer,searchroom,update,roomstatus,pickup,checkout,logout;
    Reception(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
       newcustomer= new JButton("New Customer Form");
        newcustomer.setBounds(10,30,200,30);
        newcustomer.setBackground(Color.black);
        newcustomer.setForeground(Color.WHITE);
        newcustomer.addActionListener(this);
        add(newcustomer);
        
        
         room= new JButton("Rooms");
        room.setBounds(10,70,200,30);
        room.setBackground(Color.black);
        room.setForeground(Color.WHITE);
        room.addActionListener(this);
         add(room);
         
           department= new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
         department.setForeground(Color.WHITE);
         department.addActionListener(this);
         add(department);
         
           allemployee= new JButton("All Employee");
        allemployee.setBounds(10,150,200,30);
        allemployee.setBackground(Color.black);
         allemployee.setForeground(Color.WHITE);
         allemployee.addActionListener(this);
         add(allemployee);
         
           customer= new JButton(" Customer");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.black);
         customer.setForeground(Color.WHITE);
         customer.addActionListener(this);
         add(customer);
         
           managerinfo= new JButton("Manager Info");
        managerinfo.setBounds(10,230,200,30);
        managerinfo.setBackground(Color.black);
         managerinfo.setForeground(Color.WHITE);
         managerinfo.addActionListener(this);
         add(managerinfo);
         
           checkout= new JButton("Checkout ");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
         checkout.setForeground(Color.WHITE);
         checkout.addActionListener(this);
         add(checkout);
         
           update= new JButton("Update Status ");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
         update.setForeground(Color.WHITE);
         update.addActionListener(this);
         add(update);
         
          roomstatus= new JButton("Update Room Status ");
        roomstatus.setBounds(10,350,200,30);
        roomstatus.setBackground(Color.black);
         roomstatus.setForeground(Color.WHITE);
         roomstatus.addActionListener(this);
         add(roomstatus);
         
         
          pickup= new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
         pickup.setForeground(Color.WHITE);
         pickup.addActionListener(this);
         add(pickup);
         
         searchroom= new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.black);
         searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
         add(searchroom);
         
           logout= new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.black);
         logout.setForeground(Color.WHITE);
         logout.addActionListener(this);
         add(logout);
         
          ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/reception.jpg"));
           Image i2 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
             JLabel image=new JLabel(i3);
                image.setBounds(250,30,500,500);
                add(image);
         
         
         
         
         
        

    
    setBounds(300,120,800,550);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==newcustomer){
          setVisible(false);
          new AddCustomer();
    }else if (ae.getSource()==room){
        setVisible(false);
        new Room();
    
    }else if (ae.getSource()==department){
        setVisible(false);
        new Department();
}else if (ae.getSource()==allemployee){
        setVisible(false);
        new EmployeeInfo();
}else if (ae.getSource()==managerinfo){
        setVisible(false);
        new ManegerInfo();
}else if (ae.getSource()==customer){
        setVisible(false);
        new CustomerInfo();
}else if (ae.getSource()==searchroom){
        setVisible(false);
        new SearchRoom();
}else if (ae.getSource()==update){
        setVisible(false);
        new UpdateCheck();
    }else if (ae.getSource()==roomstatus){
        setVisible(false);
        new UpdateRoom();
    
    }else if (ae.getSource()==pickup){
        setVisible(false);
        new Pickup();
    
   
    }else if (ae.getSource()==checkout){
        setVisible(false);
        new CheckOut();
    
    }else if (ae.getSource()==logout){
        setVisible(false);
        new HotelManagementSystem ();
    }}
    
    
    
    public static void main(String[] args){
    new Reception();
    
    }
    
}


package hotel.management.system;

import java.awt.*;
import java.awt.EventQueue;


import java.sql.*;	
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class CheckOut extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField t1;
        Choice c1;

		
	

		public CheckOut(){ 		
                 setBounds(530, 200, 550, 294);
                 setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                
		JLabel lblCheckOut = new JLabel("Check Out ");
		lblCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheckOut.setBounds(70, 11, 140, 35);
		contentPane.add(lblCheckOut);
		
		JLabel lblName = new JLabel("Customer Id:");
		lblName.setBounds(20, 85, 80, 14);
		contentPane.add(lblName);
                
                c1 = new Choice();
                c1.setBounds(130, 85, 150, 20);
                add(c1);
                try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from customer");
                    while(rs.next()){
                        c1.add(rs.getString("number"));    
                    }
                }catch(Exception e){ 
                e.printStackTrace();
                
                
                }

                
                ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/checkout.png"));
                Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JButton l2 = new JButton(i6);
                l2.setBounds(300,20,200,200);
                add(l2);
                
                l2.addActionListener(new ActionListener(){
                    
                    public void actionPerformed(ActionEvent ae){
                        System.out.println("Hi");
                        try{
                            
                            conn c = new conn();
                            String number = c1.getSelectedItem();
                            ResultSet rs = c.s.executeQuery("select * from customer where number = "+number);
                            
                            if(rs.next()){
                                System.out.println("clicked");
                                t1.setText(rs.getString("room_number"));    
                            }
                        }catch(Exception e){ }
                    }
                });

		
		JLabel lblRoomNumber = new JLabel("Room Number:");
		lblRoomNumber.setBounds(20, 132, 100, 20);
		contentPane.add(lblRoomNumber);
		
		t1 = new JTextField();
                t1.setBounds(130, 132, 150, 20);
		contentPane.add(t1);
                
                
                
                
                
		
                
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                String id = c1.getSelectedItem();
                                String s1 = t1.getText();
				String deleteSQL = "Delete from customer where number = "+id;
                                String q2 = "update room set availability = 'Available' where room_number = "+s1;
                                
                                
				conn c = new conn();

	    		try{
	    			
	    			
	    			c.s.executeUpdate(deleteSQL);
	    			c.s.executeUpdate(q2);
	    			JOptionPane.showMessageDialog(null, "Check Out Successful");
	    			new Reception().setVisible(true);
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
			}
		});
		btnCheckOut.setBounds(50, 200, 100, 25);
                btnCheckOut.setBackground(Color.BLACK);
                btnCheckOut.setForeground(Color.WHITE);
		contentPane.add(btnCheckOut);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(160, 200, 100, 25);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                
                getContentPane().setBackground(Color.WHITE);
                
                
                }
                
                
              public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
              }
                
                
         public static void main(String[] args) {
             new CheckOut();
            
		
	}


}

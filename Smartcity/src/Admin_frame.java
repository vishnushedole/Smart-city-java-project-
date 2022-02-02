import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin_frame {

	public JFrame frame;
	public JTable table;
	public Admin_frame() {
		frame=new JFrame();
		frame.setBounds(0,0,2400,1200);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Feedbacks");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(53, 38, 177, 44);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				feedback f= new feedback();
			}
			});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 132, 177, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PHONE NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(826, 132, 157, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(1060, 134, 157, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		 String data[][]=new String[50][50];   
	        String col[]= {"","","","",""};
	        		
	ResultSet rs;	
		Connection con;
		try
		{
	String url="jdbc:mysql://Localhost:3306/smartcity";
	String uname="root";
	String pass1="vishnu123!@#S";

	
	con= DriverManager.getConnection(url,uname,pass1);
	Statement st=con.createStatement();
	rs=st.executeQuery("select * from users");
	
		for(int i=0;i<3;i++)
		{
			
				rs.next();
				data[i][0]=rs.getString("user_name");
				data[i][1]=rs.getString("firstname");
				data[i][2]=rs.getString("lastname");
				data[i][3]=rs.getString("phone_no");
				data[i][4]=rs.getString("email_id");
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}	
		
        
		table = new JTable(data,col);
		table.setFont(new Font("Verdana", Font.PLAIN, 15));
		table.setBounds(63, 173, 1276, 600);
		table.setSize(1200,600);
		table.setVisible(true);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_3 = new JLabel("FIRST NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(344, 132, 157, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LAST NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(604, 134, 140, 26);
		frame.getContentPane().add(lblNewLabel_4);
		frame.setVisible(true);
	}
}

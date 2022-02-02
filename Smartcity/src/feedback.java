import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

public class feedback  {

	public JFrame frame;
	public JTable table;
	String data[][]= new String[50][50];

	public feedback() {
		frame=new JFrame();
		frame.setBounds(0,0,2400,1200);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER FEEDBACK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(93, 59, 373, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(782, 68, 200, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		Connection con;
		ResultSet rs;
		try {
		String url="jdbc:mysql://Localhost:3306/smartcity";
		String uname="root";
		String pass1="vishnu123!@#S";
		
		con= DriverManager.getConnection(url,uname,pass1);
		Statement st=con.createStatement();
		rs=st.executeQuery("select * from feedback_data");
	    
		int f=2;
		for(int i=0;i<f;i++)
		{
			rs.next();
			data[i][0]=rs.getString("fb");
		}
		rs=st.executeQuery("select * from feedback_data");
		for(int i=0;i<f;i++)
		{
			rs.next();
			data[i][1]=rs.getString("ei");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		String column[]= {"feedback","email id"};
		table = new JTable(data,column);
		table.setFont(new Font("Verdana", Font.PLAIN, 15));
		table.setBounds(116, 143, 1029, 615);
		table.setVisible(true);
		frame.getContentPane().add(table);
		frame.setVisible(true);
		
	}
	
	
	}


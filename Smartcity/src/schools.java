import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class schools {
    
	public JFrame frame;
    
	public String sch_info,sch_name,sch_info1,sch_fac,sch_misn,sch_loc,sch_img;
		
	public schools(int i) {
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 1500);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		try
		{
			Connection con;
	String url="jdbc:mysql://Localhost:3306/smartcity";
	String uname="root";
	String pass="vishnu123!@#S";
	
	con= DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("select * from school_data ");
	
	for(int j=0;j<i;j++)
	rs.next();
    sch_img = rs.getString("sch_img");
	sch_info=rs.getString("sch_info");
	sch_name=rs.getString("sch_name");
	sch_misn=rs.getString("sch_misn");
	sch_fac=rs.getString("sch_fac");
	sch_loc=rs.getString("sch_loc");
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}
	
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1486, 257);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource(sch_img)));
		lblNewLabel.setOpaque(true);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(sch_name);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(641, 278, 187, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(sch_info);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(0, 320, 1476, 135);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel(sch_fac);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(10, 645, 586, 172);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel(sch_misn);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(648, 653, 727, 164);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel(sch_loc);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setBounds(357, 506, 753, 61);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("School Facilities");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_7.setBounds(42, 604, 230, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("School Location");
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_8.setBounds(357, 465, 259, 31);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_6 = new JLabel("School Mission");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_6.setBounds(648, 604, 218, 39);
		frame.getContentPane().add(lblNewLabel_6);
		
		frame.setVisible(true);
	}
}


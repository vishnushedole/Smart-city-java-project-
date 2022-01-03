import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class college {
    
	private JFrame frame;
    ResultSet rs;
	String clg_info,clg_name,clg_info1,clg_branches,clg_image,clg_Iloc;
		
	public college(int i) {
		frame = new JFrame();
		frame.setBounds(0, 0, 1495, 877);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		try
		{
			Connection con;
	String url="jdbc:mysql://Localhost:3306/smartcity";
	String uname="root";
	String pass="vishnu123!@#S";
	
	con= DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	
	rs=st.executeQuery("select * from college_data ");
	
	for(int j=0;j<i;j++)
	rs.next();

	clg_info=rs.getString("clg_info");
	clg_name=rs.getString("clg_name");
	clg_branches=rs.getString("branches");
    clg_Iloc=rs.getString("location1");
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}
	
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1481, 201);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource(clg_Iloc)));
		lblNewLabel.setOpaque(true);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel(clg_name);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(668, 211, 130, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(clg_info);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(0, 253, 1476, 135);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel(clg_branches);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBounds(448, 468, 620, 362);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branches offered");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(615, 398, 245, 55);
		frame.getContentPane().add(lblNewLabel_4);
		
		frame.setVisible(true);
	}
}

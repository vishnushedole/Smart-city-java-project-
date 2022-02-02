import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.DriverManager;

public class main
{
	private static JTextField username1;
	private static JTextField password;
	private JTextField Firstname;
	private JTextField Lastname;
	private JTextField Email_id;
	private JTextField contact_no;
	private JTextField new_password;
	private JTextField new_username;
	public static int n=2;
	private JTextField admin_name;
	private JTextField admin_password;
	public main()
	{
		JFrame frame = new JFrame("SMART CITY");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setSize(2400,1200);
 		
		ImageIcon image = new ImageIcon("C:\\Users\\vaishnavi\\Downloads/logo.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setLayout(null);
		//frame.add(area);
		frame.getContentPane().setLayout(null);
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Tahoma", Font.BOLD, 25));
		username.setBounds(960, 97, 180, 30);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(960, 156, 180, 30);
		frame.getContentPane().add(lblNewLabel);
		
		username1 = new JTextField();
		username1.setFont(new Font("Verdana", Font.PLAIN, 22));
		username1.setBounds(1221, 98, 180, 30);
		frame.getContentPane().add(username1);
		username1.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("Verdana", Font.PLAIN, 22));
		password.setBounds(1221, 157, 180, 30);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				ResultSet rs; 
				 int no_of_users=0,n1=0;
				Connection con;
				try
				{
			String url="jdbc:mysql://Localhost:3306/smartcity";
			String uname="root";
			String pass1="vishnu123!@#S";
			String un=username1.getText(),pass2=password.getText();
			
			con= DriverManager.getConnection(url,uname,pass1);
			Statement st=con.createStatement();
			rs=st.executeQuery("select * from login_data");
            no_of_users=1;
			String n3,n4;
			for(int i=0;i<no_of_users;i++)
			{
				rs.next();
			n3=rs.getString("username");
			n4=rs.getString("pass");
				if(un.equals(n3) && pass2.equals(n4))
				{
					n1=1;
					break;
				}
			}
				
			
			if(n1==1)
				{
				JOptionPane.showMessageDialog(null,"Successfully loged in!");
				userframe f = new userframe();
				}
				else
					JOptionPane.showMessageDialog(null,"Please enter correct password");
				}
				catch(Exception e1)
				{
					System.out.println("Error");
				}
			}
		});
		btnNewButton.setBounds(1105, 218, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\smartC.jpg"));
		lblNewLabel_1.setBounds(96, 10, 853, 537);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("USER LOGIN");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(1013, 36, 314, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("REGISTER");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(1013, 278, 314, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FIRST NAME");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(960, 392, 180, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("LAST NAME");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(960, 453, 180, 30);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("EMAIL ID");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(960, 517,180, 30);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CONTACT NO");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(960, 577,180, 30);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("PASSWORD");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(960, 637,180, 30);
		frame.getContentPane().add(lblNewLabel_8);
		
		Firstname = new JTextField();
		Firstname.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Firstname.setBounds(1192, 395, 247, 30);
		frame.getContentPane().add(Firstname);
		Firstname.setColumns(10);
		
		Lastname = new JTextField();
		Lastname.setFont(new Font("Verdana", Font.PLAIN, 22));
		Lastname.setBounds(1192, 456, 247, 30);
		frame.getContentPane().add(Lastname);
		Lastname.setColumns(10);
		
		Email_id = new JTextField();
		Email_id.setFont(new Font("Verdana", Font.PLAIN, 22));
		Email_id.setBounds(1192, 517, 247, 30);
		frame.getContentPane().add(Email_id);
		Email_id.setColumns(10);
		
		contact_no = new JTextField();
		contact_no.setFont(new Font("Verdana", Font.PLAIN, 22));
		contact_no.setBounds(1192, 580, 247, 30);
		frame.getContentPane().add(contact_no);
		contact_no.setColumns(10);
		
		new_password = new JTextField();
		new_password.setFont(new Font("Verdana", Font.PLAIN, 22));
		new_password.setBounds(1192, 640, 247, 30);
		frame.getContentPane().add(new_password);
		new_password.setColumns(10);
		
		new_username = new JTextField();
		new_username.setFont(new Font("Verdana", Font.PLAIN, 22));
		new_username.setBounds(1192, 337, 247, 31);
		frame.getContentPane().add(new_username);
		new_username.setColumns(10);
		
		JButton register = new JButton("REGISTER");
		register.setFont(new Font("Tahoma", Font.BOLD, 20));
		register.setBounds(1105, 731, 180, 40);
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  n++;
	            	Connection conn = null;
   	                Statement stmt = null;
   	                String url="jdbc:mysql://Localhost:3306/smartcity";
   		            String username="root";
   		            String pass="vishnu123!@#S";
   		            String newuser=new_username.getText(),newpassword=new_password.getText();
   		            String fname,lname,email_id,phone_no;
   		            fname=Firstname.getText();
   		            lname=Lastname.getText();
   		            email_id=Email_id.getText();
   		            phone_no=contact_no.getText();
   	 try {
   		 Class.forName("com.mysql.jdbc.Driver");
   		 conn = DriverManager.getConnection(url,username,pass);
   		 stmt = conn.createStatement();
   		 
   		/* int arr[]=new int[4],l=newpassword.length();
   		 for(int i=0;i<l;i++)
   		 {
   			 char c=newpassword.charAt(i);
   			 if((int)c>=33 && (int)c<=47)
   				 arr[0]=1;
   			 else if((int)c>=48 && (int)c>=57)
   				 arr[1]=1;
   			 else if((int)c>=65 && (int)c>=90)
   				 arr[2]=1;
   			 else if((int)c>=97 && (int)c>=122)
   				 arr[3]=1;
   			 else
   				 continue;
   		
   		 }
   		 if(arr[0]==1 && arr[1]==1 && arr[2]==1 && arr[3]==1)
   		 { */
   		 String sql;
   		 if(newuser.length()!=0 && phone_no.length()!=0 && email_id.length()!=0 && fname.length()!=0 && lname.length()!=0)
   			{
   			 sql="INSERT INTO users (user_name,firstname,lastname,phone_no,email_id) VALUES ('"+newuser+"','"+fname+"','"+lname+"','"+phone_no+"','"+email_id+"') ";
   			 stmt.executeUpdate(sql);
   			}
   		 if(newuser.length()!=0 && newpassword.length()!=0)
   		    { 
   			 sql="INSERT INTO login_data (id,username,pass) VALUES ('"+n+"','"+newuser+"','"+newpassword+"') ";
			 stmt.executeUpdate(sql);
			 JOptionPane.showMessageDialog(null,"Registered successfully!");
			 new_username.setText("");
			 new_password.setText("");
			 Firstname.setText("");
	            Lastname.setText("");
	            Email_id.setText("");
	            contact_no.setText("");
			 }
   		 else
			 JOptionPane.showMessageDialog(null,"please enter vaild username and password");
   		 //}
   	//	 else
   		//	JOptionPane.showMessageDialog(null,"please enter vaild password");
   			 
   	 }
   	 catch(SQLException e1)
   	 {
   		 e1.printStackTrace();
   	 }
   	 catch(Exception ep)
   	 {
   		 ep.printStackTrace();
   	 }
    
    finally {
   	 try {
   		 if(stmt!=null)
   			 conn.close();
   	 }
   	 catch(SQLException e1)
   	 {
   		 e1.printStackTrace();
   	 }
   	 try {
   		 if(conn!=null)
   		 conn.close();
   	 }
   	 catch(SQLException e2)
   	 {
   		 e2.printStackTrace();
   	 }
    }
			}
			});			
		frame.getContentPane().add(register);
		
		JLabel new_user = new JLabel("USERNAME");
		new_user.setFont(new Font("Tahoma", Font.BOLD, 25));
		new_user.setHorizontalAlignment(SwingConstants.CENTER);
		new_user.setBounds(960, 337, 180, 30);
		frame.getContentPane().add(new_user);
		
		JLabel lblNewLabel_9 = new JLabel("ADMIN LOGIN");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(412, 578, 180, 33);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("ADMIN NAME");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(270, 637, 164, 28);
		frame.getContentPane().add(lblNewLabel_10);
		
		admin_name = new JTextField();
		admin_name.setFont(new Font("Tahoma", Font.PLAIN, 22));
		admin_name.setBounds(528, 637, 227, 31);
		frame.getContentPane().add(admin_name);
		admin_name.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("PASSWORD");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(270, 693, 164, 30);
		frame.getContentPane().add(lblNewLabel_11);
		
		admin_password = new JTextField();
		admin_password.setFont(new Font("Verdana", Font.PLAIN, 22));
		admin_password.setBounds(528, 698, 227, 29);
		frame.getContentPane().add(admin_password);
		admin_password.setColumns(10);
		
		JButton admin_login = new JButton("LOGIN");
		admin_login.setFont(new Font("Tahoma", Font.BOLD, 20));
		admin_login.setBounds(412, 754, 180, 40);
		admin_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=admin_name.getText(),pass=admin_password.getText();
				
				if(name.equals("vishnu") && pass.equals("vishnu123"))
				{
					JOptionPane.showMessageDialog(null,"successfully logedin!");
					Admin_frame f = new Admin_frame();
				}
			}
			});	
		frame.getContentPane().add(admin_login);
		
        
	//	frame.add(content);
		frame.setVisible(true);
	}
}
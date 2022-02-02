import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class userframe {
   // Delecration of all variabl's.
	public JFrame userframe; 
	public JComboBox select_clg,select_sch,select_malls,select_airport;
	public int clg_id,sch_id,res_id,mal_id;
	private JTextField feedback;
	private JTextField email_id1;
 
	// creation of citydiscription lable method to dispaly city discription .
	public void citydiscription()
	{
	String text = "<html><p>Bangalore officially known as Bengaluru, is the capital and the largest city of the Indian state of Karnataka. It has a population of more than 8 million and a metropolitan population of around 11 million, making it the third most populous city and fifth most populous urban agglomeration in India. Located in southern India on the Deccan Plateau, at a height of over 900 m (3,000 ft) above sea level, Bangalore is known for its pleasant climate throughout the year. Its elevation is the highest among the major cities of India."
			+ "The city's history dates back to around 890 CE, in a stone inscription found at the Nageshwara Temple in Begur, Bangalore. The Begur inscription is written in Halegannada (ancient Kannada), mentions 'Bengaluru Kalaga' (battle of Bengaluru). It was a significant turning point in the history of Bangalore as it bears the earliest reference to the name 'Bengaluru'. In 1537 CE, – a feudal ruler under the Vijayanagara Empire – established a mud fort considered to be the foundation of modern Bangalore and its oldest areas, or petes, which exist to the present day. After the fall of Vijayanagar empire in 16th century, the Mughals sold Bangalore to Chikkadevaraja Wodeyar (1673–1704), the then ruler of the Kingdom of Mysore for three lakh rupees.When Haider Ali seized control of the Kingdom of Mysore, the administration of Bangalore passed into his hands.</p></html>";
	JLabel citydiscription = new JLabel(text);
	citydiscription.setFont(new Font("Verdana", Font.PLAIN, 18));
	citydiscription.setBounds(10, 244, 1520, 234);
	userframe.getContentPane().add(citydiscription);
	}
	// creation of combobox mehtod to display combobox to select different options.
	public void createcombobox()
	{
	select_clg = new JComboBox();
	select_clg.setFont(new Font("Tahoma", Font.PLAIN, 17));
	select_clg.setModel(new DefaultComboBoxModel(new String[] {"RVCE", "MS RAMAIAH", "BMS", "DSCE", "BIT"}));
	select_clg.setBounds(1030, 498, 115, 32);
	userframe.getContentPane().add(select_clg);
	
	
	select_sch = new JComboBox();
	select_sch.setFont(new Font("Tahoma", Font.PLAIN, 17));
	select_sch.setModel(new DefaultComboBoxModel(new String[] {"jain school", "BIS", "Chrysalis HS"}));
	select_sch.setBounds(1349, 488, 115, 32);
	userframe.getContentPane().add(select_sch);
	
	select_malls = new JComboBox();
	select_malls.setFont(new Font("Tahoma", Font.PLAIN, 17));
	select_malls.setModel(new DefaultComboBoxModel(new String[] {"Truffles", "Byg Brewski Brewing Company", "Shri Sagar CTR (Central Tiffin Room)", "Shiro", "Corner House"}));
	select_malls.setBounds(1341, 667, 115, 32);
	userframe.getContentPane().add(select_malls);
	
	select_airport = new JComboBox();
	select_airport.setFont(new Font("Tahoma", Font.PLAIN, 17));
	select_airport.setModel(new DefaultComboBoxModel(new String[] {"UB City", "Vega City", ".Mantri mall ", "Orion mall ", "Forum mall "}));
	select_airport.setBounds(1030, 667, 106, 32);
	userframe.getContentPane().add(select_airport);
	}
	
	
	// create labels method to dispaly the tags of different fields .
	public void labels()
	{
	JLabel lblNewLabel_2 = new JLabel("COLLEGES");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_2.setForeground(Color.BLACK);
	lblNewLabel_2.setBackground(Color.WHITE);
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_2.setBounds(1017, 579, 155, 31);
	userframe.getContentPane().add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("SCHOOLS");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_3.setBounds(1323, 579, 148, 31);
	userframe.getContentPane().add(lblNewLabel_3);
	
	JLabel lblNewLabel_5 = new JLabel("MALLS");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_5.setBounds(1000, 737, 181, 42);
	userframe.getContentPane().add(lblNewLabel_5);
	
	JLabel lblNewLabel_6 = new JLabel("RESTAURENT");
	lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_6.setBounds(1323, 737, 192, 42);
	userframe.getContentPane().add(lblNewLabel_6);
	}
	// creating view button method to dispaly button to view the selected field.
	public void button()
	{
	JButton view_sch = new JButton("VIEW");
	view_sch.setFont(new Font("Tahoma", Font.BOLD, 15));
	view_sch.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selected_sch=select_sch.getSelectedItem().toString();
			if(selected_sch=="jain school")
				sch_id=1;
			else if(selected_sch=="BIS")
			 sch_id=2;
			else
				sch_id=3;
			
			schools sch = new schools(sch_id);
		}
	});
	view_sch.setBounds(1349, 530, 115, 32);
	userframe.getContentPane().add(view_sch);
	
	
	JButton btnNewButton_3 = new JButton("VIEW");
	btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selected_mal=select_airport.getSelectedItem().toString();
			if(selected_mal=="UB City")
				mal_id=1;
			else if(selected_mal=="Vega City")
				mal_id=2;
			else if(selected_mal==".Mantri mall")
				mal_id=3;
			else if(selected_mal=="Orion mall")
				mal_id=4;
			else
				mal_id=5;
			malls m= new malls(mal_id);
		}
	});
	btnNewButton_3.setBounds(1030, 709, 106, 32);
	userframe.getContentPane().add(btnNewButton_3);
	
	JButton btnNewButton_4 = new JButton("VIEW");
	btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selected_res=select_malls.getSelectedItem().toString();
			if(selected_res=="Truffles")
				res_id=1;
			else if(selected_res=="Byg Brewski Brewing Company")
				res_id=2;
			else if(selected_res=="Shri Sagar CTR (Central Tiffin Room)")
				res_id=3;
			else if(selected_res=="Shiro")
				res_id=4;
			else
				res_id=5;
			
			restaurant r= new restaurant(res_id);
		}
	});
	btnNewButton_4.setBounds(1341, 709, 115, 32);
	userframe.getContentPane().add(btnNewButton_4);
	
	JButton view_clg = new JButton("VIEW");
	view_clg.setFont(new Font("Tahoma", Font.BOLD, 15));
	view_clg.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String selected_clg=select_clg.getSelectedItem().toString();
			if(selected_clg=="RVCE")
				clg_id=1;
			else if(selected_clg=="MS RAMAIAH")
			 clg_id=2;
			else if(selected_clg=="BMS")
				clg_id=3;
			else if(selected_clg=="DSCE")
				clg_id=4;
			else
				clg_id=5;
			college clg = new college(clg_id);
		}
	});
	view_clg.setBounds(1030, 537, 115, 32);
	userframe.getContentPane().add(view_clg);
	}
	
	// creating logo method to display logo of a field.
	public void creating_logo()
	{
	JLabel college_logo = new JLabel();
	college_logo.setBackground(Color.YELLOW);
	college_logo.setForeground(Color.YELLOW);
	college_logo.setIcon(new ImageIcon(getClass().getResource("")));
	college_logo.setBounds(871, 328, 85, 42);
	userframe.getContentPane().add(college_logo);
	
	JLabel school_logo = new JLabel();
	school_logo.setIcon(new ImageIcon(getClass().getResource("")));
	school_logo.setBounds(1287, 327, 85, 43);
	userframe.getContentPane().add(school_logo);
	
	JLabel hospital_logo = new JLabel();
	hospital_logo.setIcon(new ImageIcon(getClass().getResource("")));
	hospital_logo.setBounds(1236, 334, 85, 43);
	userframe.getContentPane().add(hospital_logo);
	
	JLabel airport_logo = new JLabel();
	airport_logo.setIcon(new ImageIcon(getClass().getResource("")));
	airport_logo.setBounds(1247, 571, 85, 54);
	userframe.getContentPane().add(airport_logo);
	
	JLabel lblNewLabel_1 = new JLabel("GIVE YOUR FEEDBACK");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	lblNewLabel_1.setBounds(42, 484, 250, 32);
	userframe.getContentPane().add(lblNewLabel_1);
	
	feedback = new JTextField();
	feedback.setHorizontalAlignment(SwingConstants.CENTER);
	feedback.setBounds(25, 531, 435, 123);
	userframe.getContentPane().add(feedback);
	feedback.setColumns(50);
	
	
	JLabel lblNewLabel_4 = new JLabel("EMAIL ID");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	lblNewLabel_4.setBounds(42, 664, 265, 30);
	userframe.getContentPane().add(lblNewLabel_4);
	
	email_id1 = new JTextField();
	email_id1.setBounds(25, 708, 435, 33);
	userframe.getContentPane().add(email_id1);
	email_id1.setColumns(10);
	
	JButton feedbackbtn = new JButton("SUBMIT");
	feedbackbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
	feedbackbtn.setBounds(42, 748, 155, 34);
	feedbackbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
         // String email_id=email_id1.getSelectedText();
       
			
			Connection conn = null;
	    	 Statement stmt = null;
	    	 String url="jdbc:mysql://Localhost:3306/smartcity";
	    		String username="root";
	    		String pass="vishnu123!@#S";
	    		
	    	 try {
	    		 Class.forName("com.mysql.jdbc.Driver");
	    		 conn = DriverManager.getConnection(url,username,pass);
	    		 stmt = conn.createStatement();
	    		
	    		String fb=feedback.getText(),ei=email_id1.getText();
	    	     String sql="INSERT INTO feedback_data (fb,ei) VALUES('"+fb+"','"+ei+"') ";
	    				 stmt.executeUpdate(sql);
	    	 }
	    	 catch(SQLException w)
	    	 {
	    		 w.printStackTrace();
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
	     
			
			
			
          if(email_id1.getText().equals(""))
          {
        	  JOptionPane.showMessageDialog(null,"please provide email id!");
        	  
          }
         else
         {
        	 JOptionPane.showMessageDialog(null,"Submited Successfully!");
        	 email_id1.setText("");
       	  feedback.setText("");
         }
		}
	});
	userframe.getContentPane().add(feedbackbtn);
	
	JLabel city_map_label = new JLabel("CITY MAP");
	city_map_label.setFont(new Font("Tahoma", Font.BOLD, 24));
	city_map_label.setHorizontalAlignment(SwingConstants.CENTER);
	city_map_label.setBounds(752, 578, 155, 33);
	userframe.getContentPane().add(city_map_label);
	
	JButton city_map1 = new JButton("VIEW");
	city_map1.setFont(new Font("Tahoma", Font.BOLD, 15));
	city_map1.setBounds(753, 537, 130, 32);
	city_map1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		 city_map m = new city_map();
		}
	});
	userframe.getContentPane().add(city_map1);
	
	JLabel lblNewLabel_7 = new JLabel("METRO MAP");
	lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_7.setBounds(742, 748, 174, 30);
	userframe.getContentPane().add(lblNewLabel_7);
	
	JButton btnNewButton = new JButton("VIEW");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnNewButton.setBounds(753, 709, 130, 32);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		  	metro_map m= new metro_map();
		}
	});
	userframe.getContentPane().add(btnNewButton);
	}
	// select college method to select one college
	
	// creating constructor to call all methods in another class.
	public userframe()
	{
		userframe = new JFrame("Smart city");
		userframe.getContentPane().setForeground(Color.WHITE);
		userframe.getContentPane().setBackground(Color.WHITE);
		userframe.setSize(2400,1200);
		userframe.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-44,10, 1654,213);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("smartcity-B (1).jpg")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userframe.getContentPane().add(lblNewLabel);
		
		citydiscription();
		createcombobox();
		labels();
		button();
		creating_logo();
		
		userframe.setVisible(true);
	}
}
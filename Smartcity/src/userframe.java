import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userframe {

	public userframe()
	{
	JFrame userframe = new JFrame("Smart city");
	userframe.getContentPane().setForeground(Color.WHITE);
	userframe.getContentPane().setBackground(Color.WHITE);
	userframe.setSize(800,800);
	userframe.getContentPane().setLayout(null);
	JLabel lblNewLabel = new JLabel("BANGALORE");
	lblNewLabel.setBounds(0, 0, 800, 199);
	lblNewLabel.setIcon(new ImageIcon(getClass().getResource("smartcity-B.jpg")));
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
	lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	userframe.getContentPane().add(lblNewLabel);
	
	String text = "<html><p>Bangalore officially known as Bengaluru, is the capital and the largest city of the Indian state of Karnataka. It has a population of more than 8 million and a metropolitan population of around 11 million, making it the third most populous city and fifth most populous urban agglomeration in India.[12] Located in southern India on the Deccan Plateau, at a height of over 900 m (3,000 ft) above sea level, Bangalore is known for its pleasant climate throughout the year.</p></html>";
	JLabel lblNewLabel_1 = new JLabel(text);
	lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
	lblNewLabel_1.setBounds(0, 209, 786, 87);
	userframe.getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("COLLEGES");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_2.setForeground(Color.BLACK);
	lblNewLabel_2.setBackground(Color.WHITE);
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_2.setBounds(28, 411, 155, 31);
	userframe.getContentPane().add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("SCHOOLS");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_3.setBounds(288, 411, 148, 31);
	userframe.getContentPane().add(lblNewLabel_3);
	
	JButton btnNewButton_1 = new JButton("VIEW");
	btnNewButton_1.setBounds(315, 380, 85, 21);
	userframe.getContentPane().add(btnNewButton_1);
	
	JLabel lblNewLabel_4 = new JLabel("HOSPITALS");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_4.setBounds(548, 400, 161, 42);
	userframe.getContentPane().add(lblNewLabel_4);
	
	JButton btnNewButton_2 = new JButton("VIEW");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton_2.setBounds(577, 380, 85, 21);
	userframe.getContentPane().add(btnNewButton_2);
	
	JLabel lblNewLabel_5 = new JLabel("MALLS");
	lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_5.setBounds(46, 604, 155, 42);
	userframe.getContentPane().add(lblNewLabel_5);
	
	JButton btnNewButton_3 = new JButton("VIEW");
	btnNewButton_3.setBounds(73, 573, 85, 21);
	userframe.getContentPane().add(btnNewButton_3);
	
	JLabel lblNewLabel_6 = new JLabel("RESTAURENT");
	lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_6.setBounds(270, 604, 192, 42);
	userframe.getContentPane().add(lblNewLabel_6);
	
	JButton btnNewButton_4 = new JButton("VIEW");
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton_4.setBounds(315, 573, 85, 21);
	userframe.getContentPane().add(btnNewButton_4);
	
	JLabel lblNewLabel_7 = new JLabel("AIRPORT");
	lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 25));
	lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_7.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel_7.setBounds(565, 615, 155, 31);
	userframe.getContentPane().add(lblNewLabel_7);
	
	JButton btnNewButton_5 = new JButton("VIEW");
	btnNewButton_5.setBounds(597, 573, 85, 21);
	userframe.getContentPane().add(btnNewButton_5);
	
	JButton btnNewButton = new JButton("VIEW");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	btnNewButton.setBounds(62, 380, 85, 21);
	userframe.getContentPane().add(btnNewButton);
	
	JLabel college_logo = new JLabel();
	college_logo.setIcon(new ImageIcon(getClass().getResource("")));
	college_logo.setBounds(62, 327, 85, 43);
	userframe.getContentPane().add(college_logo);
	
	JLabel school_logo = new JLabel();
	school_logo.setIcon(new ImageIcon(getClass().getResource("")));
	school_logo.setBounds(315, 327, 85, 43);
	userframe.getContentPane().add(school_logo);
	
	JLabel hospital_logo = new JLabel();
	hospital_logo.setIcon(new ImageIcon(getClass().getResource("")));
	hospital_logo.setBounds(577, 327, 85, 43);
	userframe.getContentPane().add(hospital_logo);
	
	JLabel mall_logo= new JLabel();
	mall_logo.setIcon(new ImageIcon(getClass().getResource("")));
	mall_logo.setBounds(73, 509, 85, 54);
	userframe.getContentPane().add(mall_logo);
	
	JLabel restaurent_logo= new JLabel();
	restaurent_logo.setIcon(new ImageIcon(getClass().getResource("")));
	restaurent_logo.setBounds(315, 509, 85, 54);
	userframe.getContentPane().add(restaurent_logo);
	
	JLabel airport_logo = new JLabel();
	airport_logo.setIcon(new ImageIcon(getClass().getResource("")));
	airport_logo.setBounds(597, 509, 85, 54);
	userframe.getContentPane().add(airport_logo);
	
	userframe.setVisible(true);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FirstPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\smartcity-B.jpg"));
		lblNewLabel.setBounds(44, 112, 691, 455);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Userlogin = new JButton("USER LOGIN");
		Userlogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Userlogin.setBounds(10, 10, 117, 31);
        Userlogin.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				main u= new main();
			}
		});
		frame.getContentPane().add(Userlogin);
		
		JButton btnNewButton_1 = new JButton("ADMIN LOGIN");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(136, 10, 143, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton about_us = new JButton("ABOUT US");
		about_us.setFont(new Font("Tahoma", Font.PLAIN, 14));
		about_us.setBounds(289, 12, 112, 29);
		about_us.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				Aboutus a =new Aboutus();
			}
		});
		frame.getContentPane().add(about_us);
		
		JButton contactus = new JButton("CONTACT US");
		contactus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contactus.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				contactus c =new contactus();
			}
		});
		contactus.setBounds(411, 12, 130, 29);
		frame.getContentPane().add(contactus);
		
		JLabel lblNewLabel_1 = new JLabel("SMART CITY");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel_1.setBounds(146, 51, 358, 87);
		frame.getContentPane().add(lblNewLabel_1);
	}
}

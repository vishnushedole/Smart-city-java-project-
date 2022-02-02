import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class FirstPage {

	private JFrame frame;
	
	public FirstPage()
	{
		initialize();
	}
	public static void main(String args[])
	{
		FirstPage f = new FirstPage();
		
	}
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.setBounds(0,0,2400,1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\smartcity-B.jpg"));
		lblNewLabel.setBounds(256, 281, 1032, 543);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Userlogin = new JButton("USER LOGIN");
		Userlogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		Userlogin.setBounds(35, 57, 185, 47);
        Userlogin.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				main u= new main();
			}
		});
		frame.getContentPane().add(Userlogin);
		
		JButton btnNewButton_1 = new JButton("ADMIN LOGIN");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(35, 131, 185, 47);
		btnNewButton_1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				main a =new main();
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton about_us = new JButton("ABOUT US");
		about_us.setFont(new Font("Tahoma", Font.BOLD, 20));
		about_us.setBounds(35, 199, 185, 46);
		about_us.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				Aboutus a =new Aboutus();
			}
		});
		frame.getContentPane().add(about_us);
		
		JButton contactus = new JButton("CONTACT US");
		contactus.setFont(new Font("Tahoma", Font.BOLD, 20));
		contactus.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				contactus c =new contactus();
			}
		});
		contactus.setBounds(35, 270, 185, 46);
		frame.getContentPane().add(contactus);
		
		JLabel lblNewLabel_1 = new JLabel("SMART CITY");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 60));
		lblNewLabel_1.setBounds(482, 141, 575, 130);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.setVisible(true);
	}
	
}

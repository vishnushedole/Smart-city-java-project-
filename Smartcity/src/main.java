import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main
{
	private static JTextField textField;
	private static JPasswordField passwordField;
	public main()
	{
		JFrame frame = new JFrame("SMART CITY");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setSize(800,800);
 		
		ImageIcon image = new ImageIcon("C:\\Users\\vaishnavi\\Downloads/logo.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setLayout(null);
		//frame.add(area);
		frame.getContentPane().setLayout(null);
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Verdana", Font.PLAIN, 25));
		username.setBounds(181, 574, 180, 30);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setBounds(181, 632, 180, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 22));
		textField.setBounds(487, 575, 180, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 22));
		passwordField.setBounds(487, 633, 180, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Successfully loged in!");
					userframe f = new userframe();
			}
		});
		btnNewButton.setBounds(288, 713, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\smartC.jpg"));
		lblNewLabel_1.setBounds(-64, 0, 971, 525);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("USER");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnNewButton_1.setBounds(265, 516, 121, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADMIN");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnNewButton_2.setBounds(396, 516, 121, 30);
		frame.getContentPane().add(btnNewButton_2);
        
	//	frame.add(content);
		frame.setVisible(true);
	}
}

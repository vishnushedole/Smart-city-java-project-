import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main
{
	private static JTextField textField;
	private static JPasswordField passwordField;
	public static void main(String args[])
	{
		JFrame frame = new JFrame("SMART CITY");
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setSize(800,800);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
		ImageIcon image = new ImageIcon("C:\\Users\\vaishnavi\\Downloads/logo.jpg");
		frame.setIconImage(image.getImage());
		
		JLabel title = new JLabel("SMART CITY",JLabel.CENTER);
		title.setBounds(0, 0, 800, 150);
		title.setBackground(new Color(50,250,150));
		title.setText("SMART CITY");
		title.setFont(new Font("verdana",Font.PLAIN,100));
		title.setLayout(new BorderLayout());
		title.setOpaque(true);
		title.setVerticalAlignment(SwingConstants.CENTER);
		frame.getContentPane().setLayout(null);
		
		
		frame.getContentPane().add(title);
		//frame.add(area);
		frame.getContentPane().setLayout(null);
		
		JLabel username = new JLabel("USER NAME");
		username.setFont(new Font("Verdana", Font.PLAIN, 25));
		username.setBounds(133, 390, 180, 30);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel = new JLabel("PASSWORD");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblNewLabel.setBounds(133, 459, 180, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 22));
		textField.setBounds(367, 390, 180, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Verdana", Font.PLAIN, 22));
		passwordField.setBounds(368, 459, 180, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"Successfully loged in!");
					userframe f = new userframe();
			}
		});
		btnNewButton.setBounds(301, 566, 150, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 25));
		btnNewButton_1.setBounds(217, 160, 133, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SIGNIN");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 25));
		btnNewButton_2.setBounds(398, 160, 133, 48);
		frame.getContentPane().add(btnNewButton_2);
        
	//	frame.add(content);
		frame.setVisible(true);
	}
}
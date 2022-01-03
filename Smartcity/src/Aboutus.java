import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Aboutus {

	JFrame frame;
	public Aboutus() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\aboutus.jpg"));
		lblNewLabel.setBounds(0, 0, 776, 237);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><p>The key features of this Smart City web-based software are:</p>"
				+ "<p>                                                                                       </p>"
				+ "<p> 1. Using this project, the details of city can be accessed from anywhere at any time.</p>"
				+ "<p> 2. The implementation of this city project promotes tourism and business effectively.</p>"
				+ "<p> 3. Hotels can be searched more easily from anywhere.</p>"
				+ "<p> 4. With the help of this online software, students can look for the academic institutes located in the city.\r\n"
				+ "<p> 5. You can view the complete map of city using this project</p>"
				+"<p>                                                             </p>"
				+ "<p>The use of internet is rapidly growing in all cities around the globe. Nowadays, people prefer searching in internet to enquiring the locals of the city. The smart city web pages can be browsed from anywhere using internet service and all the details of the city can be accessed. One can see all the necessary information about city through this online application.</p></html>");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(10, 247, 766, 506);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}

}

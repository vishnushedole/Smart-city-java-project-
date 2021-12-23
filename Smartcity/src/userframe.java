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

public class userframe {

	public userframe()
	{
	JFrame userframe = new JFrame("Smart city");
	userframe.getContentPane().setForeground(Color.WHITE);
	userframe.getContentPane().setBackground(Color.DARK_GRAY);
	userframe.getContentPane().setLayout(null);
	userframe.setSize(800,800);
	JLabel lblNewLabel = new JLabel("BANGALORE");
	lblNewLabel.setIcon(new ImageIcon(getClass().getResource("Banglore.jpg.jpg")));
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
	lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(-168, 0, 954, 158);
	userframe.getContentPane().add(lblNewLabel);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(248, 168, 15, 21);
	userframe.getContentPane().add(comboBox);
	userframe.setVisible(true);
	}
}

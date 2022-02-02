import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class restaurant {

    private JFrame frame;
    ResultSet rs;
    String res_info,res_name,res_image,res_loc;

    public restaurant(int i) {
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

            rs=st.executeQuery("select * from restaurant_data ");

            for(int j=0;j<i;j++)
                rs.next();

            res_info=rs.getString("res_info");
            res_name=rs.getString("res_name");
            res_image=rs.getString("res_img");
            res_loc=rs.getString("res_loc");
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }


        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(-77, 10, 1558, 383);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\restaurant-img.jpg"));
        lblNewLabel.setOpaque(true);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel(res_info);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(5, 495, 1476, 135);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel(res_loc);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setBounds(302, 655, 880, 175);
        frame.getContentPane().add(lblNewLabel_3);

       
        JLabel lblNewLabel_2 = new JLabel(res_name);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(609, 418, 264, 46);
        frame.getContentPane().add(lblNewLabel_2);



        frame.setVisible(true);
    }
}
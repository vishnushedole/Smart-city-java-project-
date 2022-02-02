import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class malls {

    private JFrame frame;
    ResultSet rs;
    String mall_info,mall_name,mall_image,mall_loc;

    public malls(int i) {
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

            rs=st.executeQuery("select * from malls_data ");

            for(int j=0;j<i;j++)
                rs.next();

            mall_info=rs.getString("mall_info");
            mall_name=rs.getString("mall_name");
            mall_image=rs.getString("mall_img");
            mall_loc=rs.getString("mall_loc");
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }


        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vaishnavi\\Downloads\\malls-A.png"));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(5, 0, 1476, 383);
        //lblNewLabel.setIcon(new ImageIcon(getClass().getResource()));
        lblNewLabel.setOpaque(true);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel(mall_info);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1.setBounds(5, 495, 1476, 135);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel(mall_loc);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_3.setBounds(302, 655, 880, 175);
        frame.getContentPane().add(lblNewLabel_3);

       
        JLabel lblNewLabel_2 = new JLabel(mall_name);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(609, 418, 264, 46);
        frame.getContentPane().add(lblNewLabel_2);



        frame.setVisible(true);
    }
}
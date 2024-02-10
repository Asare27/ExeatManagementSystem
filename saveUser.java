import java.awt.*;
import javax.swing.*;


public class saveUser extends JFrame
{
    JLabel lbltitle;

    public saveUser()
    {

        //Set the Size of the JFrame
        setSize(600,600);
        setTitle("Exeat Management System");

        //Container
        Container content = getContentPane();
        content.setLayout(null);
        content.setBackground(Color.lightGray);
        lbltitle = new JLabel("User Account Registration");
        lbltitle.setBounds(50, 50, 500, 80);


        content.add(lbltitle);

    }

    public static void main(String[] args) {
        saveUser save = new saveUser();
        save.setVisible(true);
    }
    
}

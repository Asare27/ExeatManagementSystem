import javax.swing.*;
import java.awt.*;
public class studentaccount extends JFrame
{
    JLabel lbltitle;
    JLabel lblindexnumber,lblfirstname,lblothername;
    JTextField txtindexnumber, txtfirstname;

    public studentaccount(){
        // 1. JFrame
        setSize(600,600);
        setTitle("Exeat Management System");

        // 2. container
        Container content = getContentPane();
        content.setLayout(null);
        content.setBackground(Color.lightGray);
        lbltitle = new JLabel("Student Registration");
        lbltitle.setBounds(50, 50, 500, 80);

        // Label for index number

        lblindexnumber = new JLabel("Index Number");
        lblindexnumber.setBounds(50, 180, 200, 50);

        //JTextField for indexNumber
        txtindexnumber = new JTextField();
        txtindexnumber.setBounds(160, 180, 200, 50);

        //JTextField for FirstName
        lblfirstname = new JLabel("First Name");
        lblfirstname.setBounds(50, 280, 100, 50);

        // TextField for FirstName
        txtfirstname = new JTextField();
        txtfirstname.setBounds(160, 280, 200, 50);

        content.add(lbltitle);
        content.add(lblindexnumber);
        content.add(txtindexnumber);
        content.add(lblfirstname);
        content.add(txtfirstname);
    }

    public static void main(String[] args) {
        studentaccount ewin = new studentaccount();
        ewin.setVisible(true);
    }

}

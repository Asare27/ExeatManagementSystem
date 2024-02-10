import javax.swing.*;
import java.awt.*;
public class studentaccount extends JFrame
{
    JLabel lbltitle;
    JLabel lblindexnumber,lblfirstname,lblothername, lblsrname,lbloname,lbladdr,lblphone,lbluname,lblpwd,lbldob,lblage,lblprg,lblhsn;
    JTextField txtindexnumber, txtfirstname,txtsrname,txtoname,txtaddr,txtphone,txtuname,txtpwd,txtdob,txtage,txtprg,txthsn;

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

        //JLabel for FirstName
        lblfirstname = new JLabel("First Name");
        lblfirstname.setBounds(50, 280, 100, 50);

        // TextField for FirstName
        txtfirstname = new JTextField();
        txtfirstname.setBounds(160, 280, 200, 50);

        //JLable for Surname
        lblsrname = new JLabel("Surname");
        lblsrname.setBounds(50, 380, 100, 50);

       // TextField for Surname
        txtsrname = new JTextField();
        txtsrname.setBounds(160, 380, 200, 50);

        //JLabel for Othername
        lbloname = new JLabel("Othernames");
        lbloname.setBounds(50, 480, 100, 50);
        
        //TextField for Othername
        txtoname = new JTextField();
        txtoname.setBounds(160, 480, 200, 50);

        //JLable for address
        lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(50, 580, 100, 50);

        //TextField for Address
        txtdob = new JTextField();
        txtdob.setBounds(160, 580, 200, 50);

        //JLabel foe PhoneNumber
        lblage = new JLabel("Age");
        lblage.setBounds(50, 680, 100, 50);

        //JTexField for Phone Number
        txtage = new JTextField();
        txtage.setBounds(160, 680, 200, 50);

        //JLable for UserName
        lbladdr = new JLabel("Address");
        lbladdr.setBounds(50, 780, 100, 50);

        //JTexField for UserName
        txtaddr = new JTextField();
        txtaddr.setBounds(160, 780, 200, 50);

        //JLable for Programme
        lblprg = new JLabel("Programme");
        lblprg.setBounds(50, 880, 100, 50);

        //JTexField for Programme
        txtprg = new JTextField();
        txtprg.setBounds(160, 880, 200, 50);

        //JLable for House Number
        lblhsn = new JLabel("House Number");
        lblhsn.setBounds(50, 980, 100, 50);

        //JTexField for Programme
        txthsn = new JTextField();
        txthsn.setBounds(160, 980, 200, 50);

         //JLable for Password
         lblpwd = new JLabel("Password");
         lblpwd.setBounds(50, 1080, 100, 50);
 
         //JTexField for Password
         txtpwd = new JTextField();
         txtpwd.setBounds(160, 1080, 200, 50);

            content.add(lbltitle);
            content.add(lblindexnumber);
            content.add(txtindexnumber);
            content.add(lblfirstname);
            content.add(txtfirstname);
            content.add(lblsrname);
            content.add(txtsrname);
            content.add(lbloname);
            content.add(txtoname);
            content.add(lbldob);
            content.add(txtdob);
            content.add(lblage);
            content.add(txtage);
            content.add(lbladdr);
            content.add(txtaddr);
            content.add(lblprg);
            content.add(txtprg);
            content.add(lblhsn);
            content.add(txthsn);
            content.add(lblpwd);
            content.add(txtpwd);
    }

    public static void main(String[] args) {
        studentaccount ewin = new studentaccount();
        ewin.setVisible(true);
    }

}

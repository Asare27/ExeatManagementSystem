import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class javaSaveDataToMysql extends JFrame implements ActionListener
{

    JTextField UserName,userId;
    JPasswordField password;
    JButton btnLogin, btnDeleteUser,btnUpdateUser;

     Connection connection = null;

    javaSaveDataToMysql()
    {
        try
        { 
            //Calling the java driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exeat_db","root","");


        }catch(Exception exception){
            System.out.println(exception);
        }

        setLayout(null);
        setSize(600, 600);
        Container contentPane = getContentPane();

        //Field for UserId
        userId = new JTextField("Type UserID");
        userId.setBounds(320, 10, 100, 40);
        contentPane.add(userId);

        UserName= new JTextField("Type Your Username");
        UserName.setBounds(10,10,300,80);
        contentPane.add(UserName);

        password=new JPasswordField("Type Your Password");
        password.setBounds(10,100,300,80);
        contentPane.add(password);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(10,230,100,50);
        contentPane.add(btnLogin);
        btnLogin.addActionListener(this);

        btnDeleteUser = new JButton("Delete User");
        btnDeleteUser.setBounds(120,230,100,50);
        btnDeleteUser.addActionListener(this);
        contentPane.add(btnDeleteUser);

        btnUpdateUser = new JButton("Update");
        btnUpdateUser.setBounds(230,230,100,50);
        btnUpdateUser.addActionListener(this);
        contentPane.add(btnUpdateUser);
        

        



    }
       // Code to save Data into the database
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent event)
    {
        if(event.getActionCommand().equals("Login"))
        {
            try{
                String sqlcmd = "insert into trydata(id,username,password) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sqlcmd);

                stmt.setString(1, userId.getText());
                stmt.setString(2, UserName.getText());
                stmt.setString(3,password.getText());

                int row = stmt.executeUpdate();
                if(row>0){
                    JOptionPane.showMessageDialog(null, "Record Succesfully Saved");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }

            // Code to delete user Data from the Database

        } else if(event.getActionCommand().equals("Delete User")){
            try{
                String sqldu = "delete from trydata where username=?";
                PreparedStatement stmtd = connection.prepareStatement(sqldu);
                stmtd.setString(1,UserName.getText());
                int row2 = stmtd.executeUpdate();

                if(row2>0){
                    JOptionPane.showMessageDialog(null,"Record Successfully Deleted");   
                }else{
                    JOptionPane.showMessageDialog(null,"Record Failed to Delete");
                }
            }catch(Exception ex2){
                System.out.println(ex2);
            }
                // Update User Information 
        } else if(event.getActionCommand().equals("Update")){
            try{
                String sqlu = "update trydata set id=? where username=?";
                PreparedStatement stmtu = connection.prepareStatement(sqlu);
                stmtu.setInt(1,Integer.parseInt(userId.getText()));
                stmtu.setString(2, UserName.getText());
                int row3 = stmtu.executeUpdate();

                if (row3>0){
                    JOptionPane.showMessageDialog(null, "Record Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(null, "Record failed to update");
                }
            }catch(Exception ex3){
                System.out.println(ex3);
            }
        }

    }
        
        
                  
    public static void main(String[] args){
        javaSaveDataToMysql ewin =new javaSaveDataToMysql();

        ewin.setVisible(true);
    }



}
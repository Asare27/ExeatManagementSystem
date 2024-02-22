import java.sql.*;
import javax.swing.*;
public class displaymyrecords 
{
    public displaymyrecords()
    {
      JFrame f=new JFrame();
      JTable j;
      JScrollPane sp;

     try{
      Connection connection =null;
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/exeat_db","root","");

      Statement stmt;
      stmt=connection.createStatement();
      ResultSet rs;
      rs=stmt.executeQuery("SELECT * FROM useraccount");
      int i=0;
    // String[][] records=new String[1][1];
      String[][] records=new String[5][5];
      String[] header={"User ID","First Name"};
      while(rs.next())
      {
        records[i][0]=rs.getString("userid");
        records[i][1]=rs.getString("firstname");                
        i++;
      }
      j=new JTable(records,header);
      j.setBounds(30,30,600,600);
      sp= new JScrollPane(j);
      f.setTitle("Display Records");
      f.setSize(600,600);
      f.add(sp);
      f.setVisible(true);
      
      }
      catch(Exception ex){
          System.out.println("Error:"+ ex.getMessage());
      }
  }
      public static void main(String[] args){
          new displaymyrecords();
      }
}
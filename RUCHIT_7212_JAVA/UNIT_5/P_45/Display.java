/*
45. Write a JDBC program to Display data into Oracle Table
*/

import java.sql.*;

public class Display 
{
    public static void main(String[] args) 
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","");

        Statement state = con.createStatement();

        ResultSet res = state.executeQuery("select * from stud");

        while(res.next()!=false){
            System.out.println(res.getInt(1)+"  "+res.getString(2));
        }

       }
        catch(Exception e) 
       {
          System.out.println(e);
       }
    }
}

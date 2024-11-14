/*
46. Write a JDBC program to Update data into Oracle Table
*/

import java.sql.*;

public class Update {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","");

        Statement state = con.createStatement();

        int res = state.executeUpdate("Update stud set name = 'xyz' where gr=2;");
        System.out.println(res+" Records Updated");

       }catch(Exception e){
        System.out.println(e);
       }
    }
}

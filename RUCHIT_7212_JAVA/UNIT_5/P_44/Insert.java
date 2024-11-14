/*
44. Write a JDBC program to Insert data into Oracle Table
*/

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","");

        Statement state = con.createStatement();

        int res = state.executeUpdate("insert into stud values (2,'BHAGIRATH');");
        System.out.println(res+" Records Inserted");

       }catch(Exception e){
        System.out.println(e);
       }
    }
}

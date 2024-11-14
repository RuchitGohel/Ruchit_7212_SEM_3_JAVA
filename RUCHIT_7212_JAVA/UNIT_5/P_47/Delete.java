/*
47. Write a JDBC program to Delete data into Oracle Table
*/

import java.sql.*;

public class Delete {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","");

        Statement state = con.createStatement();

        int res = state.executeUpdate("delete from stud where gr=1;");
        System.out.println(res+" Records Deleted");

       }catch(Exception e){
        System.out.println(e);
       }
    }
}

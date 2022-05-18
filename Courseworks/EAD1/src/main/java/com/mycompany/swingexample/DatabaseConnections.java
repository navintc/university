package com.mycompany.swingexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnections {
    public static Connection connectMySql()throws SQLException{
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String db_url="jdbc:mysql://localhost:3306/dip202?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String db_url="jdbc:mysql://localhost:3306/sqlead?zeroDateTimeBehavior=CONVERT_TO_NULL";
            con=DriverManager.getConnection(db_url, "root", "");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException ex) {
            System.out.println("Connection could not be established");
        } finally{
            return con;
        }
    }
}


package com.mycompany.swingexample.Controllers;

import com.mycompany.swingexample.DatabaseConnections;
import com.mycompany.swingexample.Models.User;
import com.mycompany.swingexample.Views.Register;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class UserController {
    private Register view;
    public UserController(Register view){
        this.view=view;
    }
    public boolean insertUser(){
        try {
            Connection con=DatabaseConnections.connectMySql();
            User user=new User();
            user.setUsername(view.getTxtUserName().getText());
            user.setEmail(view.getTxtEmail().getText());
            user.setPhone(view.getTxtPhone().getText());
            String sql_query="insert into users values('"+user.getUsername()+"','"+user.getEmail()+"','"+user.getPhone()+"')";
            Statement statement=con.createStatement();
            statement.executeUpdate(sql_query);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}

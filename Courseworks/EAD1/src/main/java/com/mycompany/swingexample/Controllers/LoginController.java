/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexample.Controllers;

import com.mycompany.swingexample.DatabaseConnections;
import com.mycompany.swingexample.Models.User;
import com.mycompany.swingexample.Views.Login;
import com.mycompany.swingexample.Views.Todo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Navin 5
 */
public class LoginController {
    
    private Login view;
    
    public LoginController(Login view){
        this.view=view;
        view.setVisible(true);
        

        view.getBtnlogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    Connection con=DatabaseConnections.connectMySql();
                    String user_name = view.getTxtUserName().getText();
                    String password = view.getTxtPassword().getText();
                    String sql_query="select * from users where username='"+user_name+"'";

                    Statement statement=con.createStatement();
        //            statement.executeUpdate(sql_query);
                    ResultSet rs = statement.executeQuery(sql_query);
                    System.out.println(rs.next());
           

                    if (password.equals(rs.getString("password"))){
                        JOptionPane.showMessageDialog(view, "Login Succesfull");
                        
                        User userdata = new User();
                        userdata.setUSerId(rs.getInt("id"));
                        
                        Todo todoView = new Todo(userdata.getUserId());
                        
                        TodoController todoCon = new TodoController(todoView, user_name, rs.getInt("id"));
                        view.setVisible(false);
                        
                    }else{
                        JOptionPane.showMessageDialog(view, "Incorrect Password");
                    }


                } catch (SQLException ex) {
                    System.out.println("Something went wrong.."+ex.getMessage());
                }

            }
        });
    }
}

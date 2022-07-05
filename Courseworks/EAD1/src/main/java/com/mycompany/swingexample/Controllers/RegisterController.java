
package com.mycompany.swingexample.Controllers;

import com.mycompany.swingexample.DatabaseConnections;
import com.mycompany.swingexample.Models.User;
import com.mycompany.swingexample.Views.Login;
import com.mycompany.swingexample.Views.Todo;
import com.mycompany.swingexample.Views.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class RegisterController {
    private Register view;
    
    public RegisterController(Register view){
        this.view=view;
        view.setVisible(true);
        
        view.getBtnSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // gathering data from the textfields
                String user_name = view.getTxtUserName().getText();
                String email = view.getTxtEmail().getText();
                String password = view.getTxtPassword().getText();
                insertUser(user_name, email, password);
            }
        });
        
        view.getBtnMvc().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // gathering data from the textfields
                Login loginView = new Login();
                LoginController loginCon = new LoginController(loginView);  

//testing===============================================================
//                Todo todoView = new Todo();
//                TodoController todoCon = new TodoController(todoView);
//testing===============================================================
                view.setVisible(false);
            }
        });
        
    }
    
    public boolean insertUser(String user_name, String email, String password){
        
       
        try {

            // This will perform the SQL query and return boolean true
            Connection con=DatabaseConnections.connectMySql();
          
            String sql_query="insert into users (username, email, password) values('"+user_name+"','"+email+"','"+password+"')";
            Statement statement=con.createStatement();
            statement.executeUpdate(sql_query);
            JOptionPane.showMessageDialog(view, "Registered Successfully!");

            return true;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Could not Register");
            return false;
        }
    }
    
    public void testTodo(){
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexample.Controllers;

import com.mycompany.swingexample.DatabaseConnections;
import com.mycompany.swingexample.Views.Todo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navin 5
 */
public class TodoController {
    private Todo view;
    
    public TodoController(Todo view, String user_name, int userID){
        this.view=view;
        view.setVisible(true);
//        getUserTodos();
        
        System.out.println(userID);
        System.out.println(user_name);

        
        view.getBtnAddtodo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // gathering data from the textfields
                String todo = view.getTxtNewtodo().getText();
                int userid = 2;
               
                insertTodo(todo, userid);
            }
        });
        
        
        view.getBtndelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // gathering data from the textfields
                int todoID = Integer.parseInt(view.getTxttaskid().getText());

                deleteTodo(todoID);
            }
        });
        
        
        view.getBtnupdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // gathering data from the textfields
                int todoID = Integer.parseInt(view.getTxttaskid().getText());
                String todo = view.getTxttodo2().getText();
                updateTodo(todoID, todo);
            }
        });
        
        
    }
    
    
    
    
    
    public boolean insertTodo(String todo, int userid){
        
       
        try {
            // This will perform the SQL query and return boolean true
            Connection con=DatabaseConnections.connectMySql();
          
            String sql_query="insert into tasks (task, userid) values('"+todo+"','"+userid+"')";
            Statement statement=con.createStatement();
            statement.executeUpdate(sql_query);
            JOptionPane.showMessageDialog(view, "Todo added Successfully!");
            return true;
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(view, "Could not add entry : " + ex);
            return false;
        }
    }
    
    
    
    
    public boolean deleteTodo(int todoID){
        
       
        try {
            // This will perform the SQL query and return boolean true
            Connection con=DatabaseConnections.connectMySql();
          
            String sql_query="DELETE FROM tasks WHERE taskid="+todoID+";";
            System.out.println(sql_query);

            Statement statement=con.createStatement();
            statement.executeUpdate(sql_query);
            JOptionPane.showMessageDialog(view, "Todo deleted Successfully!");
            return true;
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(view, "Could not delete entry : "+ex);
            return false;
        }
    }
    
    
    
       public boolean updateTodo(int todoID, String todo){
        
       
        try {
            // This will perform the SQL query and return boolean true
            Connection con=DatabaseConnections.connectMySql();
          
            String sql_query="UPDATE tasks SET task='" + todo +"' WHERE taskid="+todoID+";";
            
            System.out.println(sql_query);

            Statement statement=con.createStatement();
            statement.executeUpdate(sql_query);
            JOptionPane.showMessageDialog(view, "Todo update Successfully!");
            return true;
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(view, "Could not update entry : "+ex);
            return false;
        }
    }
    
}

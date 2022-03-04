package com.nibm202.swinglecture;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstWindow extends JFrame {
public FirstWindow(){
setSize(600, 600);
setTitle("First Window");
JPanel panel=new JPanel();
getContentPane().add(panel);
panel.setLayout(null);
JLabel lblGreet=new JLabel("Welcome to 20.2");
lblGreet.setBounds(250, 50, 150, 50);
panel.add(lblGreet);
JLabel lblIndex=new JLabel("Index Number: ");
lblIndex.setBounds(150, 100, 200, 50);
panel.add(lblIndex);
JTextField txtIndexNumber=new JTextField();
txtIndexNumber.setBounds(300, 105, 200, 30);
panel.add(txtIndexNumber);
JLabel lblName=new JLabel("Student Name: ");
lblName.setBounds(150, 150, 150, 50);
panel.add(lblName);
JTextField txtName=new JTextField();
txtName.setBounds(300, 155, 200, 30);
panel.add(txtName);
JButton btnSave=new JButton("SAVE");
btnSave.setBounds(200, 200, 150, 50);
panel.add(btnSave);
JButton btnClear=new JButton("CLEAR");
btnClear.setBounds(375, 200, 150, 50);
panel.add(btnClear);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
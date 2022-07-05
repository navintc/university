package com.nibm202.swinglecture2;
 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class RegisterForm extends JFrame{
    private JTextField txtName;
    private JTextArea txtAddress;
    private JComboBox cmbCountry;
    private JPasswordField txtPassword;
    private JRadioButton rdbMale;
    private JRadioButton rdbFemale;
    private JCheckBox chkTerms;
    private JLabel lblTitle,lblName,lblAddress,lblCountry,lblPassword,lblGender,lblTerms;

    private JButton btnSave,btnClear;

    private JFrame window;

    public RegisterForm(){
        setSize(600, 600);
        setTitle("User Registration");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Adding a container object to window.
        JPanel panel=new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        //Add UI controls
        lblTitle=new JLabel("Register");
        lblTitle.setBounds(250, 50, 100, 30);
        lblTitle.setFont(new Font(lblTitle.getFont().getName(),Font.BOLD,18));
        panel.add(lblTitle);
        lblName=new JLabel("Name: ");
        lblName.setBounds(150,100,100,30);
        panel.add(lblName);
        txtName=new JTextField();
        txtName.setBounds(270, 105, 200, 25);
        panel.add(txtName);
        lblAddress=new JLabel("Address: ");
        lblAddress.setBounds(150, 135, 100, 30);
        panel.add(lblAddress);
        txtAddress=new JTextArea();
        txtAddress.setBounds(270, 140, 200, 50);
        panel.add(txtAddress);
        lblCountry=new JLabel("Country: ");
        lblCountry.setBounds(150, 195, 100, 30);
        panel.add(lblCountry);
        String[] countries={"Select a Country","USA","Austrailia","Sri Lanka","India"};
        cmbCountry=new JComboBox(countries);
        cmbCountry.setSelectedIndex(0);
        cmbCountry.setBounds(270, 200, 200, 25);
        panel.add(cmbCountry);
        lblPassword=new JLabel("Password: ");
        lblPassword.setBounds(150, 230, 100, 30);
        panel.add(lblPassword);
        txtPassword=new JPasswordField();
        txtPassword.setBounds(270, 235, 200, 25);
        panel.add(txtPassword);
        lblGender=new JLabel("Gender: ");
        lblGender.setBounds(150,260,100,30);
        panel.add(lblGender);
        rdbMale=new JRadioButton("Male");
        rdbMale.setBounds(270, 265, 100, 25);
        panel.add(rdbMale);
        rdbFemale=new JRadioButton("Female");
        rdbFemale.setBounds(375, 265, 100, 25);
        panel.add(rdbFemale);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(rdbMale);
        buttonGroup.add(rdbFemale);
        chkTerms=new JCheckBox("By Clicking this check box you agree to termsand conditions");
        chkTerms.setBounds(150, 300, 300, 30);
        panel.add(chkTerms);

        btnSave=new JButton("SAVE");
        btnSave.setBounds(300, 350, 80, 30);
        panel.add(btnSave);
        btnClear=new JButton("CLEAR");
        btnClear.setBounds(390, 350, 80, 30);
        panel.add(btnClear);

        window=this;
        //Add Event Handlers
        eventHandlers();
    }

    public void eventHandlers(){
        //Button Clicked Event
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Get Values from text fields
                String name=txtName.getText();
                String address=txtAddress.getText();
                //Get selected Values from drop down/combo box
                String country=cmbCountry.getSelectedItem().toString();
                //Check whether a radio button is selected
                String gender="";
                if(rdbMale.isSelected()==true){
                    gender="Male";
                }else if(rdbFemale.isSelected()==true){
                    gender="Female";
                }
                String password=txtPassword.getText();
                //check whether a check box is selected or not
                boolean agree=false;
                if(chkTerms.isSelected()==true){
                    agree=true;
                }
                JOptionPane.showMessageDialog(window, "Button Save Clicked!");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Set Values for text Fields
                txtName.setText("");
                txtAddress.setText("");
                //Set Default selected item
                cmbCountry.setSelectedIndex(0);
                //set state of radio button
                rdbMale.setSelected(false);
                rdbFemale.setSelected(false);
                txtPassword.setText("");
                //set state of check box.
                chkTerms.setSelected(false);
                JOptionPane.showMessageDialog(window, "Button Clear Clicked");
            }
        });
        //Selected Item Changed in Combo box
        cmbCountry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(window, cmbCountry.getSelectedItem().toString());
            }
        });
        //Selected State changed checkbox
        chkTerms.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(window, "Check box state changed..");
            }
        });
        //Text Changed Event of text fields
        txtName.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e){
                JOptionPane.showMessageDialog(window, "Text Changed");
            }
        });
    }
}
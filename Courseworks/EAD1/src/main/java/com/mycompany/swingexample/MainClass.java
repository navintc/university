
package com.mycompany.swingexample;

import com.mycompany.swingexample.Views.Register;
import com.mycompany.swingexample.Controllers.RegisterController;


public class MainClass {
    public static void main(String[] args){
//        new Register().setVisible(true);
        
        Register regView = new Register();
        RegisterController regCon = new RegisterController(regView);
        
    }
}

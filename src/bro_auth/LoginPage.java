package bro_auth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage extends JFrame implements ActionListener {
    JButton btnlogin = new JButton("Login");
    JButton btnreset = new JButton("Reset");

    JTextField txtuserid = new JTextField();
    JTextField txtpw = new JTextField();

    JLabel lbluserid = new JLabel("User ID");
    JLabel lblpw = new JLabel("Password");


    HashMap<String,String> logininfo = new HashMap<String,String>();
    public LoginPage(HashMap<String, String> loginInfoOrginal){
     logininfo = loginInfoOrginal;





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

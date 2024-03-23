package bro_auth;

import javax.swing.*;
import java.awt.*;
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
    JLabel lblmsg = new JLabel();


    HashMap<String,String> logininfo = new HashMap<String,String>();
    public LoginPage(HashMap<String, String> loginInfoOrginal){
     logininfo = loginInfoOrginal;

     lbluserid.setBounds(50,100,76,25);
     lblpw.setBounds(50,150,76,25);

     lblmsg.setBounds(125,250,260,35);
     lblmsg.setFont(new Font(null,Font.ITALIC,25));

     txtuserid.setBounds(125,100,200,25);
     txtpw.setBounds(125,150,200,25);

     btnlogin.setBounds(125,200,100,25);
     btnlogin.addActionListener(this);

     btnreset.setBounds(225,200,100,25);
     btnreset.addActionListener(this);


     this.add(lbluserid);
     this.add(lblpw);
     this.add(lblmsg);
     this.add(txtuserid);
     this.add(txtpw);
     this.add(btnlogin);
     this.add(btnreset);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(420,420);
    this.setLayout(null);
    this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

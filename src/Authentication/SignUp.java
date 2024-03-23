package Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
    JButton btnsignup;
    JButton btnlogin;
    JLabel lblid;
    JLabel lblname;
    JLabel lblemail;
    JLabel lblphone;
    JLabel lbladdress;
    JLabel lblpassword;

    JTextField txtid;
    JTextField txtname;
     JTextField txtemail;
     JTextField txtphone;
     JTextField txtaddress;

     JTextField txtpassword;

     JPanel panel;




    public SignUp(){
        lblid = new JLabel("ID");
        lblid.setBounds(580,30,200,40);
        txtid = new JTextField();
        txtid.setPreferredSize(new Dimension(250,40));
        txtid.setBounds(800,30,250,40);



        btnlogin = new JButton("Login");
        btnsignup = new JButton("Sign Up");
        this.setTitle("Sign Up");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1360,730);
        this.setVisible(true);
        this.setLayout(null);

        this.add(lblid);
        this.add(txtid);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

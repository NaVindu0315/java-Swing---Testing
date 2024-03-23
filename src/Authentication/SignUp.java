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
        //id
        lblid = new JLabel("ID");
        lblid.setBounds(500,30,200,40);
        txtid = new JTextField();
        txtid.setPreferredSize(new Dimension(250,40));
        txtid.setBounds(720,30,250,40);

        //name
        lblname = new JLabel("name");
        lblname.setBounds(500,80,200,40);
        txtname = new JTextField();
        txtname.setPreferredSize(new Dimension(250,40));
        txtname.setBounds(720,80,250,40);

        //email
        lblemail = new JLabel("email");
        lblemail.setBounds(500,130,200,40);
        txtemail = new JTextField();
        txtemail.setPreferredSize(new Dimension(250,40));
        txtemail.setBounds(720,130,250,40);

        //phone
        lblphone = new JLabel("Phone");
        lblphone.setBounds(500,180,200,40);
        txtphone = new JTextField();
        txtphone.setPreferredSize(new Dimension(250,40));
        txtphone.setBounds(720,180,250,40);

        //address
        lbladdress = new JLabel("Address");
        lbladdress.setBounds(500,200,200,40);
        txtaddress = new JTextField();
        txtaddress.setPreferredSize(new Dimension(250,40));
        txtaddress.setBounds(720,200,250,40);

        //password
        lblpassword = new JLabel("Passowrd");
        lblpassword.setBounds(500,250,200,40);
        txtpassword = new JTextField();
        txtpassword.setPreferredSize(new Dimension(250,40));
        txtpassword.setBounds(720,250,250,40);

        //buttons
         btnsignup = new JButton("Sign Up");
         btnsignup.setBounds(500,300,200,40);
         btnsignup.addActionListener(this);

         btnlogin = new JButton("Login");
         btnlogin.setBounds(720,300,200,40);
         btnlogin.addActionListener(this);


        this.setTitle("Sign Up");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1360,730);
        this.setVisible(true);
        this.setLayout(null);

        this.add(lblid);
        this.add(txtid);

        this.add(lblname);
        this.add(txtname);

        this.add(lblemail);
        this.add(txtemail);

        this.add(lbladdress);
        this.add(txtaddress);

        this.add(lblpassword);
        this.add(txtpassword);
        this.add(btnlogin);
        this.add(btnsignup);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

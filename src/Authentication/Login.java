package Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton btnsignup;
    JButton btnlogin;
    JLabel lblid;

    JLabel lblemail;

    JLabel lblpassword;

    JTextField txtid;

    JTextField txtemail;


    JTextField txtpassword;

    JPanel panel;

    int v_id;

    String v_email;

    String v_password;




    JLabel signlbl;


    Login(){

        signlbl = new JLabel("Login");
        signlbl.setBounds(610,0,100,30);

        //id
        lblid = new JLabel("ID");
        lblid.setBounds(500,30,200,40);
        txtid = new JTextField();
        txtid.setPreferredSize(new Dimension(250,40));
        txtid.setBounds(720,30,250,40);



        //email
        lblemail = new JLabel("email");
        lblemail.setBounds(500,130,200,40);
        txtemail = new JTextField();
        txtemail.setPreferredSize(new Dimension(250,40));
        txtemail.setBounds(720,130,250,40);





        //password
        lblpassword = new JLabel("Passowrd");
        lblpassword.setBounds(500,280,200,40);
        txtpassword = new JTextField();
        txtpassword.setPreferredSize(new Dimension(250,40));
        txtpassword.setBounds(720,280,250,40);

        //buttons
        btnsignup = new JButton("Sign Up");
        btnsignup.setBounds(500,330,200,40);
        btnsignup.addActionListener(this);

        btnlogin = new JButton("Login");
        btnlogin.setBounds(720,330,200,40);
        btnlogin.addActionListener(this);


        this.setTitle("Sign Up");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(1360,730);
        this.setVisible(true);
        this.setLayout(null);
        this.add(signlbl);

        this.add(lblid);
        this.add(txtid);



        this.add(lblemail);
        this.add(txtemail);


        this.add(lblpassword);
        this.add(txtpassword);
        this.add(btnlogin);
        this.add(btnsignup);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==btnlogin)
        {
                v_id = Integer.parseInt(txtid.getText());
                v_email = txtemail.getText();
                v_password = txtpassword.getText();
        }
        if (e.getSource()==btnsignup)
        {
            this.dispose();
            new SignUp();
        }

    }
}

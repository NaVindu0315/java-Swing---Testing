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

     int v_id;
     String v_name;
     String v_email;
     int v_phone;
     String v_address;
     String v_password;




    JLabel signlbl;

    public SignUp(){
        signlbl = new JLabel("Sign Up");
        signlbl.setBounds(610,0,100,30);

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
        lbladdress.setBounds(500,230,200,40);
        txtaddress = new JTextField();
        txtaddress.setPreferredSize(new Dimension(250,40));
        txtaddress.setBounds(720,230,250,40);

        //password
        lblpassword = new JLabel("Passowrd");
        lblpassword.setBounds(500,280,200,40);
        txtpassword = new JTextField();
        txtpassword.setPreferredSize(new Dimension(250,40));
        txtpassword.setBounds(720,280,250,40);

        //buttons
         btnsignup = new JButton("Sign Up");
         btnsignup.setBounds(720,330,200,40);
         btnsignup.addActionListener(this);

         btnlogin = new JButton("Login");
         btnlogin.setBounds(500,330,200,40);
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

        this.add(lblname);
        this.add(txtname);

        this.add(lblemail);
        this.add(txtemail);

        this.add(lblphone);
        this.add(txtphone);

        this.add(lbladdress);
        this.add(txtaddress);

        this.add(lblpassword);
        this.add(txtpassword);
        this.add(btnlogin);
        this.add(btnsignup);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnsignup)
        {
            v_id = Integer.parseInt(txtid.getText());
            v_name = txtname.getText();
            v_email = txtemail.getText();
            v_phone = Integer.parseInt(txtphone.getText());
            v_address = txtaddress.getText();
            v_password = txtpassword.getText();

            System.out.println(v_id );
            System.out.println(v_name );
            System.out.println( v_email);
            System.out.println(v_address);
            System.out.println( v_password);
        }
        if(e.getSource()==btnlogin)
        {
            this.dispose();
            new Login();
        }

    }
}

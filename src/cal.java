import javax.swing.*;

public class cal {
    JFrame frm;
    //lables
    JLabel lblnum1;


    ///txt fields
    JTextField txt1;

    ///buttons

    cal()
    {
        frm = new JFrame("Calculator");
        JPanel panel = new JPanel();
        frm.setSize(500,500);

        lblnum1 = new JLabel("Number 1");
       // lblnum1.setBounds(20,40,300,100);
        lblnum1.setLocation(30,40);

    /*
    *
    * JPanel panel = new JPanel();
panel.setLayout(null);

lblnum1.setLocation(x, y);
panel.add(lblnum1);
    * */





        //display
        panel.setLayout(null);
        panel.add(lblnum1);
        frm.add(lblnum1);
        frm.setVisible(true);

    }
}

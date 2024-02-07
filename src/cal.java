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
        frm.setSize(500,500);

        lblnum1 = new JLabel("Number 1");
        lblnum1.setBounds(20,40,300,100);







        //display
        frm.add(lblnum1);
        frm.setVisible(true);

    }
}

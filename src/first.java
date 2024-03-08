import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class first {
    private JPanel panel1;
    private JTextField helloTextField;
    private JPasswordField passwordField1;
    private JButton button1;

    public static class cal implements ActionListener {


            //initializing
            JFrame f= new JFrame("Calculator");
            JLabel l1,l2 , lblanswer;
            JTextField num1,num2,txtans;
            JButton btnadd,btnsub,btnclear;



            cal()
            {
                //first label
                l1=new JLabel("Number 1.");
                l1.setBounds(50,50, 100,30);
                //firs textfied
                num1 = new JTextField();
                num1.setBounds(120,50, 100,30);
                num1.addActionListener(this);

                //label2
                l2=new JLabel("Number 2.");
                l2.setBounds(50,100, 100,30);
                //second textfied
                num2 = new JTextField();
                num2.setBounds(120,100, 100,30);
                num2.addActionListener(this);
                //buttons
                btnadd = new JButton("Add");
                btnadd.setBounds(50,150,60,20);
                btnadd.addActionListener(this);

                btnsub = new JButton("subtract");
                btnsub.setBounds(130,150,80,20);
                btnsub.addActionListener(this);

                //answer label
                txtans = new JTextField();
                txtans.setBounds(60,190,50,30);
                txtans.setVisible(false);

                btnclear = new JButton("Clear");
                btnclear.setBounds(150,190,90,30);
                btnclear.addActionListener(this);

                //lblanswer = new JLabel(String.valueOf(ans));
               /// lblanswer.setBounds(120,190,50,50);


                //addings
                f.add(l1); f.add(l2);
                f.add(num1); f.add(num2);
                f.add(btnadd);
                f.add(btnsub);
                f.add(txtans);
                f.add(btnclear);
                //f.add(lblanswer);

                //fram size
                f.setSize(300,300);
                f.setLayout(null);
                f.setVisible(true);
            }


        @Override
        public void actionPerformed(ActionEvent e) {
            String ans= "";
            ///variabls for calculating
            String txt1choice,txt2choice;
            int number1,number2,intans=0;

                txt1choice = num1.getText();
                txt2choice = num2.getText();
                //converting
             number1 = Integer.parseInt(txt1choice);
             number2 =Integer.parseInt(txt2choice);

             if(e.getSource()==btnadd)
             {
                 intans = number1+number2;
                 ans = String.valueOf(intans);
                 txtans.setText(ans);
                 txtans.setVisible(true);

             }
             else if(e.getSource()== btnsub)
             {
                 intans = number1-number2;
                 ans = String.valueOf(intans);
                 txtans.setText(ans);
                 txtans.setVisible(true);


             }
             else if(e.getSource()==btnclear)
             {
                 txtans.setVisible(true);
                 num1.setText("");
                 num2.setText("");
                 txtans.setText("");
             }







        }
    }

    public static class Messages {

        JFrame frm;
        Messages()
        {
        frm = new JFrame("NaVindu LakShan");
        final JTextField txtfield = new JTextField();
        txtfield.setBounds(50,50,150,20);
        JButton btn1 = new JButton("Click");
        btn1.setBounds(50,100,95,30);
        frm.add(btn1);
        frm.add(txtfield);
        frm.setSize(400,400);
        frm.setVisible(true);



        }
    }
}

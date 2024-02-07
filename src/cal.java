import javax.swing.*;

public class cal {

    {
        JFrame f= new JFrame("Calculator");
        JLabel l1,l2;
        JTextField num1,num2;
        //first label
        l1=new JLabel("Number 1.");
        l1.setBounds(50,50, 100,30);
        //firs textfied
        num1 = new JTextField();
        num1.setBounds(120,50, 100,30);
        //label2
        l2=new JLabel("Number 2.");
        l2.setBounds(50,100, 100,30);


       //addings
        f.add(l1); f.add(l2);
        f.add(num1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

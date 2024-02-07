import javax.swing.*;

public class cal {

    {
        //initializing
        JFrame f= new JFrame("Calculator");
        JLabel l1,l2;
        JTextField num1,num2;
        JButton btnadd,btnsub;


        //first label
        l1=new JLabel("Number 1.");
        l1.setBounds(50,50, 100,30);
        //firs textfied
        num1 = new JTextField();
        num1.setBounds(120,50, 100,30);
        //label2
        l2=new JLabel("Number 2.");
        l2.setBounds(50,100, 100,30);
        //second textfied
        num2 = new JTextField();
        num2.setBounds(120,100, 100,30);
        //buttons
        btnadd = new JButton("Add");
        btnadd.setBounds(50,150,60,20);

        btnsub = new JButton("subtract");
        btnsub.setBounds(130,150,80,20);


       //addings
        f.add(l1); f.add(l2);
        f.add(num1); f.add(num2);
        f.add(btnadd);
        f.add(btnsub);

        //fram size
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

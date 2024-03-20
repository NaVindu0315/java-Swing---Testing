package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    JButton backbutton = new JButton("Back");
    NewWindow(){

        label.setBounds(100,160,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        backbutton.setBounds(100,260,200,40);
        backbutton.setFont(new Font(null,Font.PLAIN,25));
        backbutton.addActionListener(this);



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.add(backbutton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backbutton)
        {
            frame.dispose();
            LaunchPage lp = new LaunchPage();
        }
    }
}

package pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton mybutton = new JButton("next page");
    public LaunchPage(){

        mybutton.setBounds(100,160,200,40);
        mybutton.setFocusable(false);
        mybutton.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(mybutton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mybutton)
        {
            NewWindow  myWindow = new NewWindow();
        }
    }
}

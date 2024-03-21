package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons extends JFrame implements ActionListener {

    JRadioButton pizzabtn;
    JRadioButton hamburgerbtn;
    JRadioButton hotdogbtn;
    public RadioButtons(){


        pizzabtn = new JRadioButton("Pizza");
        hamburgerbtn = new JRadioButton("Hamburger");
        hotdogbtn = new JRadioButton("Hot Dog");



        this.add(pizzabtn);
        this.add(hamburgerbtn);
        this.add(hotdogbtn);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

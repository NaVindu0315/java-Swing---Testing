package layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayouts extends JFrame {

    public FlowLayouts()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null); //to manually change the location of components defualt border layout or something
        this.setVisible(true);
        this.setLayout(new FlowLayout());

        JButton button1 = new JButton();

        this.add(new JButton("1"));
        this.add(new JButton("1"));
        this.add(new JButton("1"));
        this.add(new JButton("1"));
        this.add(new JButton("1"));
        this.add(new JButton("1"));





    }
}

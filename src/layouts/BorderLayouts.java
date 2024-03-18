package layouts;

import javax.swing.*;

public class BorderLayouts extends JFrame {

    public BorderLayouts(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLayout(null); //to manually change the location of components defualt border layout or something
        this.setVisible(true);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
    }
}

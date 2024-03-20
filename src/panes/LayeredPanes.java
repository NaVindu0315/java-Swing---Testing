package panes;

import javax.swing.*;
import java.awt.*;

public class LayeredPanes extends JFrame {

    public LayeredPanes(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null); //to manually change the location of components defualt border layout or something
        this.setVisible(true);
        this.setLayout(null);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);


        this.add(layeredPane);
    }
}

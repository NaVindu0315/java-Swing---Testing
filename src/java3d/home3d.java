package java3d;

import javax.swing.*;
import java.awt.*;

public class home3d extends JFrame {

    Screen screen = new Screen();

    public home3d(){

        this.add(screen);


        //this.setUndecorated(true);
       // this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setSize(800,700);
        this.setVisible(true);
    }
}

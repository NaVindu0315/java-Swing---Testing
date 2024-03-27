package floor3d;

import javax.swing.*;

public class FloorFrame extends JFrame {

    FloorPanel fpnl = new FloorPanel();

    public FloorFrame(){
        this.add(fpnl);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,1000);
        //this.setLayout(null);
        this.setVisible(true);
    }
}

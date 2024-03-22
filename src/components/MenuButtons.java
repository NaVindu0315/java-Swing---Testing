package components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuButtons extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu filemenu =  new JMenu("Files");
    JMenu editmenu = new JMenu("Edit");
    JMenu helmenu = new JMenu("Help");
    public MenuButtons(){

        menuBar = new JMenuBar();
        menuBar.add(filemenu);
        menuBar.add(helmenu);
        menuBar.add(editmenu);
        this.setJMenuBar(menuBar);





        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        /// this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package keybindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;


    public Game(){
        frame = new JFrame("Key Bindindg");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);
        frame.add(label);
        frame.setVisible(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();



    }
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
                    label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public  class DownAction  extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public  class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}

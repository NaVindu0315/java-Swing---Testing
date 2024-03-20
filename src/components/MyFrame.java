package components;

import javax.swing.*;
import java.awt.*;


///creating a child class
public class MyFrame extends JFrame {

        MyFrame(){

            //frame assigned name
            //title
            this.setTitle("title here");
            //to close the program on close button
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false); //prevent frame from begin resized
            //defining the size of the frame
            this.setSize(420,420);
            this.setVisible(true); //to make this visiblew

            //creating image icon
            ImageIcon image = new ImageIcon("mn.png");
            this.setIconImage(image.getImage()); //to chnge icon of frame


            //chgning color
            this.getContentPane().setBackground(Color.cyan);
        }
}

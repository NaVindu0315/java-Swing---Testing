import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /*JFrame frame = new JFrame();
        //frame assigned name
        //title
        frame.setTitle("title here");
        //to close the program on close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //prevent frame from begin resized
        //defining the size of the frame
        frame.setSize(420,420);
        frame.setVisible(true); //to make this visiblew

        //creating image icon
        ImageIcon image = new ImageIcon("mn.png");
        frame.setIconImage(image.getImage()); //to chnge icon of frame


        //chgning color
        frame.getContentPane().setBackground(Color.cyan);*/
        //calling the class
        //MyFrame myFrame  = new MyFrame();

        //label create
        JLabel label = new JLabel();
        //set the text of the label
        label.setText("Fuck of MF");


        ///label end

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        //add the label
        frame.add(label);

    }
}

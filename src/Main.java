import Listners.KeyListners;
import components.*;
import layouts.BorderLayouts;
import layouts.FlowLayouts;
import layouts.GridLaouts;
import pages.LaunchPage;
import panes.LayeredPanes;
import panes.OptionPanes;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
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
        //components.MyFrame myFrame  = new components.MyFrame();

        //label create
        //creating image icon

        ///2nd video
        /*
        ImageIcon image = new ImageIcon("mn.png");
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green,3); //creating border

        //set the text of the label
        label.setText("Fuck off MF");
        label.setIconTextGap(40);//to adjust the gap between  text and image
        label.setIcon(image);//adding the image

        label.setBackground(Color.black);//chaging the color
        label.setOpaque(true);//display background color

        label.setHorizontalTextPosition(JLabel.CENTER); ///set text lef center or right
        label.setVerticalTextPosition(JLabel.TOP);//to chnge the location of the text
        label.setForeground(Color.RED);// to chnge font color
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setBorder(border); //calling the border
        label.setVerticalAlignment(JLabel.TOP);  //this changes the location of the label
        label.setHorizontalAlignment(JLabel.CENTER); //horizontal positon of label and icon withing the label

       // label.setBounds(70,50,250,250); //after layout setting null from this location can be chgned

        ///label end */



/*
         ///3rd video
        ImageIcon icon = new ImageIcon("dudu.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
       // label.resize(25,25);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(10,40,75,75);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red); //panel creation
        redpanel.setBounds(0,0,250,250);
        redpanel.setLayout(null);


        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue); //panel creation
        bluepanel.setBounds(250,0,250,250);
        bluepanel.setLayout(null);


        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green); //panel creation
        greenpanel.setBounds(0,250,250,250);
        greenpanel.setLayout(null);*/

        //4th
       // new btns.buttonclass();
        /*components.MyFrame frame1 =  new components.MyFrame();*/



        ///controller
      //  new BorderLayouts();
       // new FlowLayouts();
       // new GridLaouts();
    //new LayeredPanes();

        //LaunchPage launchpage = new LaunchPage();
   // new OptionPanes();
    //new TextFields();
        //new CheckBoxes();
    //new RadioButtons();
        //new ComboBoxes();

       // new Sliders();
       //new ProgressBars();
       // new MenuButtons();

       // new FileChoosers();
       // new ColorPickers();
    new KeyListners();

    }
}

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        //frame assigned name
        //title
        frame.setTitle("title here");
        //to close the program on close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //prevent frame from begin resized
        //defining the size of the frame
        frame.setSize(420,420);
        frame.setVisible(true); //to make this visiblew
    }
}

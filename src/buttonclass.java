import javax.swing.*;

public class buttonclass extends JFrame {

    buttonclass()
    {
        JButton button = new JButton();
        button.setText("Payya");
        button.setBounds(200,100,100,50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);

    }
}

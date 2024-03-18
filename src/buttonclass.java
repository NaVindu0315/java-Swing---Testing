import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonclass extends JFrame implements ActionListener {
    JButton button = new JButton();
    buttonclass()
    {
        ImageIcon icon = new ImageIcon("dudu.png");


        button.setText("Doo Baba");
        button.setFocusable(false);
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            System.out.println("paka");
        }
    }
}

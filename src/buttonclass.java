import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonclass extends JFrame implements ActionListener {
    JButton button = new JButton();
    JLabel lbl1 = new JLabel();
    buttonclass()
    {
        ImageIcon icon = new ImageIcon("dudu.png");
        ImageIcon icon2 = new ImageIcon("bubu.png");
        lbl1.setIcon(icon2);
        lbl1.setBounds(200,150,150,150);
        lbl1.setVisible(false);
        lbl1.setBackground(Color.BLACK);
        lbl1.setBorder(BorderFactory.createLineBorder(Color.black));


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
        this.add(lbl1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            System.out.println("paka");
            lbl1.setVisible(true);
        }
    }
}

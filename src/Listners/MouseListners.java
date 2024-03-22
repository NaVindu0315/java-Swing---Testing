package Listners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListners extends JFrame implements MouseListener {

    JLabel lbl;

    public MouseListners(){
        lbl = new JLabel();
        lbl.setBounds(0,0,100,100);
        lbl.setBackground(Color.red);
        lbl.setOpaque(true);
        this.add(lbl);
        lbl.addMouseListener(this);

        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        // this.pack();
        this.setVisible(true);
       // this.addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
          //  System.out.println("Ponnaya");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("Paka ebuwa");
        System.out.println("Payya  alluwa");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Payya Athariya");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

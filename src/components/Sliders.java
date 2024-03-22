package components;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

public class Sliders extends JFrame implements ChangeListener {

        JPanel panel;
        JLabel label;
        JSlider slider;

    public Sliders(){

        this.setTitle("Title demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100);



    }
    @Override
    public void stateChanged(ChangeEvent e) {

    }
}

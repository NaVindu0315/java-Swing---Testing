package java3d;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    polygonob polygonob = new polygonob(new int[]{10,200,10},new int[]{10,200,400}, Color.black);
    public Screen()
    {

    }

    public void paintComponent(Graphics g)
    {
        polygonob.drawPolygon(g);
       // g.fillOval(10,10,500,500);

    }
}

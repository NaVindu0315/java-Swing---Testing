package java3d;

import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    //polygonob polygonob = new polygonob(new int[]{10,200,10},new int[]{10,200,400}, Color.black);

  static   double[] ViewFrom = new double[]{10,10,10};
  static   double[] ViewTo = new double[]{0,0,0};
    Dpolygon dploy = new Dpolygon(new double[]{2,4,2},new double[]{2,4,6}, new double[]{5,5,5},Color.black);
    static PolygonObject[] DrawablePolygons = new PolygonObject[100];
   static int Numberofploygons =0;
    public Screen()
    {

    }

    public void paintComponent(Graphics g)
    {
     //  polygonob.drawPolygon(g);
       // g.fillOval(10,10,500,500);
        for(int i=0 ; i<Numberofploygons;i++)
            DrawablePolygons[i].drawPolygon(g);

    }
}

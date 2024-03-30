package java3d;

import java.awt.*;

public class PolygonObject {
    Polygon p = new Polygon();
    Color c;

    public PolygonObject(double[]x , double []y, Color c)
    {
        Screen.Numberofploygons++;

        for (int i= 0;i<x.length;i++ )
        {
            p.addPoint((int)x[i],(int)y[i]);

            this.c =c;
        }

    }

    void drawPolygon(Graphics g)
    {
        g.setColor(c);
        g.drawPolygon(p);
    }
}

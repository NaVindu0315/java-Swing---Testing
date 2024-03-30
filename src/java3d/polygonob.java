package java3d;

import java.awt.*;

public class polygonob {
    Polygon p = new Polygon();
    Color c;

    public  polygonob(double[]x , double []y,Color c)
    {

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

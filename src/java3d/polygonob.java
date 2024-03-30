package java3d;

import java.awt.*;

public class polygonob {
    Polygon p = new Polygon();
    Color c;

    public  polygonob(int[]x , int []y,Color c)
    {

        p.xpoints = x;
        p.ypoints = y;
        p.npoints = x.length;
        this.c =c;
    }

    void drawPolygon(Graphics g)
    {
        g.setColor(c);
        g.drawPolygon(p);
    }
}

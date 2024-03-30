package java3d;

import java.awt.*;

public class d3polygon {
 double[]   ViewFromX = new double[]{10,10,10};
    double[]   View2 = new double[]{0,0,0};



    Polygon p = new Polygon();
    Color c;
    int[]x;
    int[]y;
    int []z;




    public d3polygon(int[]x ,int []y ,int[]z , Color c ){

        this.x = x;
        this.y = y;
        this.z = z;
        this.c =c;
    }


}

package java3d;

import java.awt.*;

public class d3polygon {
 double[]   ViewFromX = new double[]{10,10,10};
    double[]   View2 = new double[]{0,0,0};



    Polygon p = new Polygon();
    Color c;
    double[]x;
    double[]y;
    double []z;





    public d3polygon(double[]x ,double []y ,double[]z , Color c ){

        this.x = x;
        this.y = y;
        this.z = z;
        this.c =c;
        createPolygon();
    }
    void  createPolygon(){
         double[] newx = new double[x.length];
         double[] newy = new double[y.length];
         for(int i=0;i<x.length;i++)
         {
             newx[i] = Calculator.CalculatePositionx(Screen.ViewFrom,Screen.ViewTo,x[i],y[i],z[i]);
             newy[i] = Calculator.CalculatePositionx(Screen.ViewFrom,Screen.ViewTo,x[i],y[i],z[i]);

         }

        Screen.DrawablePolygons[Screen.Numberofploygons] =new polygonob(newx,newy,c);
    }


}

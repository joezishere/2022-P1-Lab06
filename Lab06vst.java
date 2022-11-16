// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
    Random rand = new Random();

    for(int k=1; k < 100; k++) {
        int  x1 = rand.nextInt(390) + 10;
        int  x2 = rand.nextInt(390) + 10;
        int y1 = rand.nextInt(290) + 10;
        int  y2 = rand.nextInt(290) + 10;
        int col1 = rand.nextInt(255);
        int col2 = rand.nextInt(255);
        int col3 = rand.nextInt(255);


        g.setColor(new Color(col1, col2, col3));
        g.drawLine(x1, y1, x2, y2);

        // Draw Random Squares


        x1 = rand.nextInt(345)+397;
        y1 = rand.nextInt(240) + 10;
        int height = 50;
        int width = 50;
        g.setColor(new Color(col1, col2, col3));
        g.fillRect(x1, y1, width, height);


        // Draw Random Circles
        x1 = rand.nextInt(200)+10;
        y1 = rand.nextInt(75) + 310;
        int radius = rand.nextInt(200);

        g.setColor(new Color(col1, col2, col3));
        g.drawOval(x1, y1, radius, radius);

        // Draw 3-D Box


    }
    }

}



    
 
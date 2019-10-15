package problem2;

import java.awt.*;
import java.applet.*;

public class problem2 extends Applet {
   public void paint(Graphics g) {
	   	
       g.drawOval(100, 70, 30, 30);
       g.drawRect(105, 100, 20, 30);
       g.drawLine(105, 100, 200, 120);
       char text[]= {'a','a','a','a','a'};
       g.drawChars(text, 0, 5, 100, 50);
       for(int i=0;i<=10;i++) {
    		g.drawRect(100+10*i,100+9*i, 12, 12);
       }
    }
}
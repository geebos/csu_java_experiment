/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_10;


import java.applet.*;
import java.awt.*;


public class chapter_10_2 extends Applet {
    public void paint(Graphics g){
        g.drawLine(10,60,110,60);
        g.drawLine(110,60,60,10);
        g.drawLine(60,10,10,60);
        g.drawLine(50,45,70,45);
        g.drawLine(60,35,60,55);
        g.drawLine(60,110,60,140);

        g.drawRect(50,35,20,20);
        g.drawRect(20,60,80,80);
        g.drawRect(50,110,20,30);
    }
}

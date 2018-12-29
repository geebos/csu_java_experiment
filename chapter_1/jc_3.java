/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_1;
import java.awt.*;
import java.applet.Applet;

public class jc_3 extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(80,20,20,100);
        g.drawLine(20,100,140,100);
        g.drawLine(140,100,80,20);
        g.setColor(Color.blue);
        g.drawString("三角形", 65, 80);

    }
}

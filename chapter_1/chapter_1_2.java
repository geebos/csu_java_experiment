/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_1;

import java.awt.*;
import java.applet.Applet;


public class chapter_1_2 extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawRect(10,10,50,50);
        g.setColor(Color.red);
        g.drawOval(10,10,50,50);
    }
}

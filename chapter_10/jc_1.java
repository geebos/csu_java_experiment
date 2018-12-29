/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_10;

import java.awt.*;
import java.applet.*;

public class jc_1 extends Applet {
    String str="";
    public void init(){
        str=str+"->init()";
    }

    public void start(){
        str=str+"->start()";
    }

    public void paint(Graphics g){
        str=str+"->paint()";
        g.drawString(str,50,20);
    }
}


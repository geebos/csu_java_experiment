/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class jc_2 extends Applet implements Runnable {
    public void paint(Graphics g){
        int x=10+(int)(Math.random()*100);
        int y=10+(int)(Math.random()*100);
        g.drawRect(x,y,100,100);
    }

    public void init(){
        Thread x=new Thread(this);
        x.start();
    }

    public void run(){
        for(;;){
            repaint();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}

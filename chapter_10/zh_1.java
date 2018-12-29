/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_10;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class zh_1 extends Applet{
    private int a,b;
    public void init(){
        a=Integer.parseInt(JOptionPane.showInputDialog("a"));
        b=Integer.parseInt(JOptionPane.showInputDialog("b"));
    }
    public boolean isPrime(int n){
        for(int k=2;k<n;k++)
            if(n%k==0)
                return false;
        return true;
    }
    public void paint(Graphics g){
        int x=50,y=50;
        int m=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                g.drawString(" "+i,x,y);
                m++;
                x=x+40;
                if(m%5==0){
                    x=50;
                    y=y+40;
                }
            }
        }
    }
}

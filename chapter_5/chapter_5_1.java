/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_5;
import javax.swing.*;
import java.text.DecimalFormat;


public class chapter_5_1 {
    public static void main(String args[]) {
        SimpleTime t = new SimpleTime(12, 30, 19);
        JOptionPane.showMessageDialog(null, t.buildString(),
                "\"this\"引用示范",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

class SimpleTime{
    private int hour, minute, second;

    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
        return "this.toString():"+this.toString()+
                "\ntoString():"+toString()+
                "\nthis (with implict toString() call):"+this;
    }

    public String toString(){
        return hour+":"+minute+":"+second;
    }
}

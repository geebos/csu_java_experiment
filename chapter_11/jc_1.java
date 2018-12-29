/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_11;

import java.awt.*;
import java.awt.event.*;

public class jc_1 extends Frame implements ActionListener {
    public jc_1(){
        super("更改背景");
        setLayout(new FlowLayout());
        Button btn=new Button("更改背景");
        btn.addActionListener(this);
        add(btn);
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Color c=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        setBackground(c);
    }
    public static void main(String args[]){
        new jc_1();
    }
}

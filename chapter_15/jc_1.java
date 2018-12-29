/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_15;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class jc_1 extends JFrame implements ActionListener{
    JButton btn;

    public static void main(String args[]){
        new jc_1();
    }

    public void actionPerformed(ActionEvent e){
        Color a[]={Color.red,Color.blue,Color.green,Color.orange};
        btn.setBackground(a[(int)(Math.random()*4)]);
    }

    public jc_1(){
        Container cont=getContentPane();
        btn=new JButton("变色");
        cont.add(btn);
        setSize(200,200);
        setVisible(true);
        btn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

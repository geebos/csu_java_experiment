/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_15;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class chapter_15_1 {
    public static void main(String[]args){
        ActionListener listener=new TimePrinter();
        Timer t=new Timer(1000,listener);

        t.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        Date now=new Date();

        System.out.println("At the tone, the time is "+now);

        Toolkit.getDefaultToolkit().beep();
    }
}


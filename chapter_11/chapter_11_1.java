/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chapter_11_1 extends Frame {
    public chapter_11_1(){
        super("打印无符号整数位");
        setLayout(new FlowLayout());
        add(new Label("请输入整数："));
        final TextField output=new TextField(33);
        TextField input=new TextField(10);
        input.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int val=Integer.parseInt(e.getActionCommand());
                        output.setText(getBits(val));
                    }
                }
        );
        add(input);
        add(new JLabel("该数的二进制位表示是"));
        output.setEditable(false);
        add(output);
        setSize(720,70);
        show();
    }
    private String getBits(int value){
        int displayMask=1<<31;
        StringBuffer buf=new StringBuffer(35);
        for(int c=1;c<=32;c++) {
            buf.append(
                    (value & displayMask) == 0 ? '0' : '1');
            value <<= 1;
            if (c % 8 == 0)
                buf.append(' ');
        }
        return buf.toString();
    }
    public static void main(String args[]){
        chapter_11_1 app=new chapter_11_1();
        app.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
    }
}



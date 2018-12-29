/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_15;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;
public class chapter_15_2 extends JFrame{
    private JLabel label;
    private String path[]=new String[5];
    private Icon icon[]= new Icon[5];

    public static void main(String args[]) {
        //JOptionPane.showMessageDialog(null,p,"浏览器",JOptionPane.PLAIN_MESSAGE);
        new chapter_15_2();
    }

    public chapter_15_2() {
        super("测试窗口");
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JList<String> list = new JList<String>();
        list.setPreferredSize(new Dimension(300,200));
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String[] string =new String[] {"img1","img2","img3","img4"};
        list.setListData(string);

        //图像路径
        for(int i=1;i<=4;i++) {
            path[i] = "D:\\JAVA\\experiment\\src\\chapter_15\\img"+i+".jpg";
            icon[i] = new ImageIcon(path[i]);
        }

        TreeMap<String,String> treemap = new TreeMap<String,String>();

        //映射图片路径和名称
        for(int i=1;i<4;i++) {
            treemap.put(string[i], path[i]);
        }

        //默认初始的图片
        label =new JLabel(icon[1]);
        //右边的面板
        JPanel jp = new JPanel();
        jp.add(label);

        //左边的滑条面板
        JScrollPane p = new JScrollPane(list);
        JSplitPane js = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p,jp);
        setContentPane(js);
        setVisible(true);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int index = list.getSelectedIndex();
                ListModel<String> listModel = list.getModel();
                String nowimagpath=treemap.get(listModel.getElementAt(index));

                for(int i=1;i<=4;i++) {
                    if(nowimagpath.equals(path[i])) {
                        label.setIcon(icon[i]);
                        jp.repaint();
                        break;
                    }
                }
                //输出选中项
                System.out.println("选中:"+index+"="+listModel.getElementAt(index));
            }
        });
        list.setSelectedIndex(1);
    }
}


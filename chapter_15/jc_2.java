/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_15;

import javax.swing.*;

public class jc_2 {
    public static void main(String args[]){
        String res=" ";
        for(int m=1;m<=99;m++)
            for(int n=m;n<=99;n++){
                int s=m+n;
                if(s>=100) continue;
                int a=s%10;
                int b=s/10;

                int x=m*n;
                if(x>=1000)continue;
                int one=x%10;
                int two=(x/10)%10;
                int three=x/100;

                if(one==two && one==three && a==b)
                    res=res+m+","+n+"\n";
            }
        JTextArea text=new JTextArea(res);
        JScrollPane p=new JScrollPane(text);
        JOptionPane.showMessageDialog(null,p,"结果",JOptionPane.PLAIN_MESSAGE);
    }
}


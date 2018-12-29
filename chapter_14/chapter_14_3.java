/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_14;

import java.util.*;

public class chapter_14_3{

}

class Student{
    private String user[] = new String[10];
    private String tel[] = new String[10];

    public static void main(String args[]) {
        Student stu =  new Student();
        stu.init();
        stu.hashMap();
        stu.treeMap();
    }

    public void init() {
        StringBuffer tels = new StringBuffer();

        for(int i=0;i<10;i++) {
            user[i]="user"+(int)(Math.random()*10);
            for(int j=0;j<11;j++) {
                tels.append(""+(int)(Math.random()*10));
            }
            tel[i]=tels.toString();

            tels.delete(0, tels.length());
        }

        for(int i=0;i<10;i++) {
            System.out.println(tel[i]+" "+user[i]);
        }
    }

    public void hashMap() {
        HashMap<String,String> hash= new HashMap<String,String>();

        for(int i=0;i<10;i++) {
            hash.put(tel[i], user[i]);
        }

        System.out.println(hash.toString());
        System.out.println();
    }

    public void treeMap() {
        TreeMap<String,String> tree = new TreeMap<String,String>();

        for(int i=0;i<10;i++) {
            tree.put(tel[i], user[i]);
        }

        System.out.println(tree.toString());
    }
}



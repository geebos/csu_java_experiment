/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_14;

import java.io.*;
import java.util.*;

public class zh_1 {
    String name;
    long stno;
    String sex;

    public zh_1(String name,long stno,String sex){
        this.name=name;
        this.stno=stno;
        this.sex=sex;
    }

    public String toString(){
        return "姓名;"+name+"，学号："+stno+"，性别:"+sex;
    }

    public static void main(String args[]){
        Vector<zh_1>group=new Vector<zh_1>();
        outer:while(true) {
            String ch = input("选择：1-增加，2-显示，3-退出");
            int choice =Integer.parseInt(ch);
            switch(choice){
                case 1:group.add(inputzh_1());break;
                case 2:Iterator p=group.iterator();
                    while(p.hasNext())
                        System.out.println("==>"+p.next());
                    break;
                case 3:break outer;
            }
        }
    }

    public static String input(String hint){
        String x=null;

        BufferedReader br=new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println(hint);

        try{
            x=br.readLine();
        }catch (IOException e){}

        return x;
    }

    public static zh_1 inputzh_1(){
        String name=input("请输入姓名：");
        long stno=Long.parseLong(input("请输入学号:"));
        String sex=input("请输入性别：");
        return new zh_1(name,stno,sex);
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_13;

import java.io.*;

public class jc_2 {
    static String s;
    public static int find(String in){
        int n=0;
        int counter=0;
        while(n!=-1){
            n=in.indexOf((int)'A',n+1);
            counter++;
        }
        return counter-1;
    }
    public  static void main(String[]args){
        try{
            int n=0;
            FileReader file=new FileReader("d\\JAVA\\experiment\\src\\chapter_13\\jc_1.java");
            BufferedReader in=new BufferedReader(file);
            boolean eof=false;
            while(!eof){
                String x=in.readLine();
                if(x==null)
                    eof=true;
                else
                    s=s+x;
            }
            System.out.print("the number of A is:"+find(s));
            in.close();
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_7;

import java.io.*;

public class zh_2 {
    public static void main(String[] args)throws IOException{
        String line;
        char ch;
        boolean isWord=false;

        StringBuffer word=new StringBuffer();

        System.out.print("输入一行文本：");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        line=br.readLine();
        for(int i=0;i<line.length();i++){
            ch=line.charAt(i);

            if(Character.isLetter(ch)){
                word.append(ch);
                isWord=true;
            }
            else{
                if(isWord){
                    word.append(",");
                    isWord=false;
                }
            }
        }

        String x[]=word.toString().split(",");
        System.out.println("共有"+x.length+"个单词");

        for(int n=0;n<x.length;n++){
            System.out.print(x[n]+" ");
        }
    }
}

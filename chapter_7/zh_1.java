/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_7;

public class zh_1 {
    public static void main(String args[]){
        String s="（a+b）";
        if(count(s,'(')==count(s,')')){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static int count(String s,char c){
        int x=0;
        for(int k=0;k<s.length();k++)
            if(s.charAt(k)==c)x++;
        return x;
    }
}


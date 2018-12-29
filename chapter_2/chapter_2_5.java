/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_2;

public class chapter_2_5 {
    public static void main(String args[]) {
        char a = 'h';
        byte b = 6;
        int i = 200;
        long n = 567L;
        float f = 98.99f;
        double d = 4.7788;
        int aa = a+i;
        long nn = n-aa;
        float ff = (float)(b*d);
        double dd = ff/aa + d;
        System.out.println("aa="+aa);
        System.out.println("nn="+nn);
        System.out.println("ff="+ff);
        System.out.println("dd="+dd);
    }
}

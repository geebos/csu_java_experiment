/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_3;
import java.util.Scanner;

public class chapter_3_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s=0, b=0, c=0, d=0, e=0, f=0;

        System.out.println("请输入学生成绩，输入 -1结束：");
        int a = in.nextInt();

        while(a != -1){
            switch (a / 10){
                case 0: case 1: case 2: case 3: case 4: case 5:
                    b++;break;
                case 6:
                    c++;break;
                case 7:
                    d++;break;
                case 8:
                    e++;break;
                case 9:
                    f++;break;
            }
            s += a;
            a = in.nextInt();
        }

        System.out.println("优秀人数："+f);
        System.out.println("良好人数："+e);
        System.out.println("中等人数："+d);
        System.out.println("及格人数："+c);
        System.out.println("不及格人数："+b);
        int average = s / (b+c+d+e+f);
        System.out.println("平均分="+average);
    }
}

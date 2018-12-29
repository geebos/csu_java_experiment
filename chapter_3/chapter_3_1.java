/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_3;
import java.util.Scanner;

public class chapter_3_1 {
    public static void main(String args[]) {
        System.out.print("请输入 x：");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();

        double y;
        if(x <= 0){
            y = 0;
        }
        else if(x > 0 && x < 5){
            y = 2 * x + 1;
        }
        else{
            y = x * x - 1;
        }

        System.out.println("y 的值为："+y);
    }
}

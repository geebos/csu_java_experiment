/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_3;
import java.util.Scanner;

public class chapter_3_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个长整数：");
        long input = in.nextLong();

        int sum = 0;
        while(input != 0){
            int rest = (int)(input % 10);
            if(rest > 5){
                sum++;
            }
            input = input / 10;
        }
        System.out.println("该数中大于 5的数字的个数为："+sum);
    }
}

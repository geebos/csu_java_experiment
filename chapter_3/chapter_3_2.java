/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_3;
import java.util.Scanner;

public class chapter_3_2 {
    public static void main(String args[]) {
        System.out.print("请输入 n：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long result = 0;
        for(int i = 0; i <= n; i++){
            result = result + (long)Math.pow(2, i);
        }
        System.out.println("result="+result);
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_4;
import java.util.Scanner;

public class chapter_4_2 {
    public static void main(String args[]) {
        int numbers[] = new int[100];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = (int)(Math.random() * 100);
            System.out.print(numbers[i]+" ");
            if(i % 10 == 9){
                System.out.print("\n");
            }
        }
        System.out.print("\n请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == n){
                sum++;
            }
        }

        if(sum == 0){
            System.out.println("整数 "+n+"不在数组中");
        }
        else{
            System.out.println("整数 "+n+"在数组中共出现了 "+sum+"次");
        }
    }
}

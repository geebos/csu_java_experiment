/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_3;

public class chapter_3_4 {
    public static void main(String args[]) {
        System.out.println("10 ~ 100之间能够被 3或 5整除的数如下：");
        for(int i=10;i<=100;i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.print(i+" ");
                if(i % 10 == 0){
                    System.out.print('\n');
                }
            }
        }
    }
}

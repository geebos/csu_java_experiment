/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_7;
import java.util.Scanner;

public class chapter_7_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("请输入一个英文句子：");

        String sentence = in.nextLine();

        String words[] = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            char litters[] = words[i].toCharArray();
            if(litters[0] >= 'a' && litters[0] <= 'z'){
                litters[0] = (char)(litters[0] + ('A' - 'a'));
            }
            words[i] = "";
            for(int k=0;k<litters.length;k++){
                words[i] += litters[k];
            }
        }
        System.out.println("结果为："+String.join(" ", words));
    }
}

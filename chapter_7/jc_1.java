/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_7;

public class jc_1 {
    public static void main(String args[]){
        String x="a good idea.";
        System.out.println(x.charAt(0));

        if(x.indexOf("a")!=-1) {
            System.out.println("有a");
        }
        else {
            System.out.println("没有a");
        }
    }
}


/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_9;

public class jc_2 extends Exception{
    public String toString(){
        return "异常啦";
    }
    public static void method()throws jc_2{
        throw new jc_2();
    }
    public static void main(String a[]){
        try{
            method();
            System.out.println("这里执行不到");
        }
        catch (jc_2 e){
            System.out.println(e);
        }
        System.out.println("这里要执行");
    }
}
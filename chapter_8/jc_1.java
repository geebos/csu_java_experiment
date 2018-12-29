/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_8;


public class jc_1 extends Shape_1{
    public double area(){
        return 100;
    }
    public static void main(String a[]){
        jc_1 x=new jc_1();
        System.out.println(x.area());
    }
}

abstract class Shape_1{
    abstract public double area();
}


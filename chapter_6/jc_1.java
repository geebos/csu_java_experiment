/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

public class jc_1 extends parent{
    int x=200;

    public void m(){
        System.out.println("x="+x);
        System.out.println("super.x="+super.x);
        super.m();
    }

    public static void main(String args[]){
        parent a =new jc_1();
        a.m();
        System.out.println(a.x);
    }
}

class parent{
    int x=100;

    void m(){
        System.out.println(x);
    }
}



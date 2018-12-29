/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

public class jc_2 {
    public static void main(String args[]) {
        example2.main(args);
    }
}

class example2 {
    int x=200;

    public example2(){
        x=300;
    }

    public example2(int y){
        x=y;
    }

    public static void main(String args[]){
        example2 a=new example2();
        example2 b=new example2(20);

        a.m1(2,3);
        b.m1(50);
        a.m1(9);

        System.out.println("a.x="+a.x);
        System.out.println("b.x="+b.x);
    }

    public void m1(int k){
        x = x+k;
    }
    public void m1(){
        x = x-1;
    }
    public void m1(int x,int y){
        this.x=this.x+x*y;
    }
}


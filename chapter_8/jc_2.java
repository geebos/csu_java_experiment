/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_8;


public class jc_2 implements Listener {
    public void action(){
        System.out.println("stand up");
    }

    public void add(Listener a){
        a.action();
    }

    public static void main(String a[]){
        Listener x[]={new jc_2(),new test3()};

        x[0].action();
        x[1].action();

        jc_2 y=new jc_2();

        y.add(y);
        y.add(new test3());
    }
}

interface Listener{
    void action();
}

class test3 implements Listener{
    public void action(){
        System.out.println("sit down");
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_12;

public class chapter_12_1 {
    public static void main(String args[]){
        Hello h=new Hello();
        Thread t=new Thread(h);
        t.start();
    }
}

class Hello implements Runnable{
    int i=0;
    public void run(){
        while(true){
            System.out.println("Hello!");
            if(i++==5) break;
        }
    }
}


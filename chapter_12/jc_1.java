/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_12;

public class jc_1 extends Thread {
    int sleep_time;

    public jc_1(String name,int t){
        super(name);
        sleep_time=t;
    }

    public void run(){
        for(int k=1;k<=10;k++){
            System.out.println(getName()+":"+k);
        }
        try{
            sleep(sleep_time);
        }catch(InterruptedException e){}
    }

    public static void main(String args[]){
        Thread x1=new jc_1("first",5000);
        x1.setPriority(6);
        x1.start();
        new jc_1("second",2000).start();
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_8;


public class zh_1 {
    class Desk implements canPlay{
        String name;

        public void play(){
            System.out.println(name+"正在玩...");
        }

        public Desk(String desk_name){
            name=desk_name;
            this.play();
        }
    }

    String name;

    public static void main(String args[]){
        zh_1 x=new zh_1("Chess");
        x.begin("Chess");

        zh_1 y=new zh_1("Poker");
        y.begin("Poker");
    }

    public zh_1(String zh_1_name){
        name=zh_1_name;
    }

    public void begin(String name){
        new Desk(name);
    }
}

interface canPlay{
    void play();
}


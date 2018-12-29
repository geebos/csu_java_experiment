/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

public class chapter_6_3 {
    public static void main(String args[]) {
        Person person = new Person();
        Person footballer = new FootballSporter();
        Person singer = new Singer();

        person.work();
        footballer.work();
        singer.work();
    }
}

class Person{
    private String name;
    public void work(){
        System.out.println("正在工作...");
    }
}

class FootballSporter extends Person{
    public void work(){
        System.out.println("正在踢球...");
    }
}

class Singer extends Person{
    public void work(){
        System.out.println("正在唱歌...");
    }
}

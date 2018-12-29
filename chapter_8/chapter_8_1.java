/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_8;
import java.text.*;

public class chapter_8_1 {
    public static void main(String []args){
        Person p=new Student("王甜甜","计算机科学");
        System.out.println(p.getName()+","+p.getDescription());
    }
}

abstract class Person{
    public Person(String n){
        name=n;
    }
    public abstract String getDescription();
    public String getName(){
        return name;
    }
    private String name;
}
class Student extends Person{
    public Student(String n,String m){
        super(n);
        major=m;
    }
    public String getDescription(){
        return "学生专业是"+major;
    }
    private String major;
}
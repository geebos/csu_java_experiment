/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

public class chapter_6_1 {
    int x,y;
    public chapter_6_1(){}
    public chapter_6_1(int x,int y){this.x=x;this.y=y;}
    public chapter_6_1(chapter_6_1 p){this.x=p.x;this.y=p.y;}

    public chapter_6_1 getLocation(){
        chapter_6_1 p=new chapter_6_1(x,y);
        return p;
    }

    public String toString(){return "("+x+","+y+")";}

    public static void main(String args[]){
        chapter_6_1 p=new chapter_6_1(5,5);
        System.out.println("x="+p.x+",y="+p.y);
        System.out.println("Location is"+p.getLocation());
    }

}

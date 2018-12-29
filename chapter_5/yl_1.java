/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_5;


public class yl_1 {
    public  static void main(String args[]){
        Point a = new Point();

        System.out.println(a);

        Point b = a;
        a.x=5;
        System.out.println(b);

        b = new Point(8,3);
        System.out.println(b);

        b = null;
        System.out.println(b);

        Point c[] = {a,b};
        System.out.println(c[0]+","+c[1]);

        Point d[] = new Point[8];
        d[0] = a;
        d[1] = b;

        for(int k=0;k<c.length;k++){
            System.out.println(d[k]);
        }

        d[6]=new Point(4,6);
    }
}

class Point{
    int x;
    int y;
    public Point(){
        this(10,10);
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return x+","+y;
    }
}



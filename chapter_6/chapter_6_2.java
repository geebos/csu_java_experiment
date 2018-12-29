/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

import java.awt.*;

public class chapter_6_2 {
    public static void main(String args[]) {
        Pointer p1 = new Pointer(10,10);
        Pointer p2 = new Pointer(20,20);


        System.out.printf("求当前点与另一个方法参数的距离: %4.2f\n", p1.getDistance(p2));
        System.out.printf("求两个方法参数的距离: %4.2f\n", p1.getDistance(p1, p2));
        System.out.printf("求当前点与给定点的距离: %4.2f\n", p1.getDistance(20, 20));
        System.out.printf("方法给定的两个点之间的距离: %4.2f\n", p1.getDistance(10, 10, 20, 20));
    }
}


class Pointer{
    private double x, y;

    public Pointer(){}
    public Pointer(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    //求当前点与另一个方法参数的距离
    public double getDistance(Pointer p){
        return Math.sqrt(Math.pow(p.getX()-x, 2)+Math.pow(p.getY()-y, 2));
    }
    //求两个方法参数的距离
    public double getDistance(Pointer p1, Pointer p2){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
    }
    //求当前点与给定点的距离
    public double getDistance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
    }
    //方法给定的两个点之间的距离
    public double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
    }
}
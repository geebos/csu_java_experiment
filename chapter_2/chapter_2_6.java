/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_2;
import java.util.*;

public class chapter_2_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆柱体的半径和高：");
        double r = in.nextDouble();
        double h = in.nextDouble();

        CircleVolume c = new CircleVolume(r, h);
        System.out.println("圆柱体的体积为: "+c.getVolume());
    }
}


class CircleVolume{
    private double r;
    private double h;
    private final double PI = 3.141592654;

    CircleVolume(double r, double h){
        this.r = r;
        this.h = h;
    }

    double getVolume(){
        return PI * r * r * h;
    }
}
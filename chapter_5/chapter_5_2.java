/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_5;

public class chapter_5_2 {
    public static void main(String args[]) {
        Pointer zero_point = new Pointer(0,0);
        Pointer points[] = new Pointer[10];

        //产生 10个随机点
        int n = 10;
        for(int i=0;i<n;i++){
            points[i] = new Pointer();
            points[i].setX(Math.random()*10 + 10);
            points[i].setY(Math.random()*10 + 10);
        }

        //排序
        Pointer temp;
        for(int i=0;i<n;i++){
            for(int k=i;k<n;k++){
                if(points[k].getDistance(zero_point) < points[i].getDistance(zero_point)){
                    temp = points[k];
                    points[k] = points[i];
                    points[i] = temp;
                }
            }
        }

        //输出
        System.out.println("按与原点距离从小到大排序如下：");
        for(int i=0;i<n;i++){
            System.out.printf("(%4.2f, %4.2f) distance to (0, 0) is: %4.2f\n",
                    points[i].getX(), points[i].getY(), points[i].getDistance(zero_point));
        }
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

    public double getDistance(Pointer p){
        return Math.sqrt(Math.pow(p.getX()-x, 2)+Math.pow(p.getY()-y, 2));
    }
}

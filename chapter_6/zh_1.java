/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_6;

public class zh_1 {
    double upper;
    double bottom;
    double height;

    public zh_1(double upper,double bottom,double height){
        this.upper=upper;
        this.bottom=bottom;
        this.height=height;
    }

    public double area(){
        return (upper+bottom)*height/2;
    }

    public static double area(zh_1 me){
        return(me.upper+me.bottom)*me.height/2;
    }

    public static double area(double upper,double bottom,double height){
        return (upper+bottom)*height/2;
    }

    public static void main(String a[]){
        zh_1 x=new zh_1(2,6,3);

        System.out.println("面积1="+x.area());
        System.out.println("面积2="+area(new zh_1(2,8,4)));
        System.out.println("面积3="+area(3,8,5));
    }
}


/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_9;


public class zh_1 {
    double a,b,c;
    public zh_1(double a,double b,double c)throws Notzh_1Exception{
        if(a+b>c && a+c>b && b+c>a){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            throw new Notzh_1Exception();
        }

    }

    public double area(){
        double p=(a+b+c)/2;
        return(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    public static void main(String a[]){
        try{
            zh_1 x=new zh_1(2,2,4);
            System.out.println(x.area());
        }
        catch(Notzh_1Exception e){
            System.out.println(e);
        }
    }
}

class Notzh_1Exception extends Exception{
    public String toString(){
        return "不能构成三角形";
    }
}

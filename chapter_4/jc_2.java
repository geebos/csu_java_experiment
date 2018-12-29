/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_4;

public class jc_2 {
    private static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+","+y);
    }

    private static void swap2(int x[]){
        int temp=x[0];
        x[0]=x[1];
        x[1]=temp;
    }

    private static int comm(int x,int y){
        //用1到min（x，y）之间的数去除x，y，均能除尽的最后一个就是
        for(int k=Math.min(x,y);k>1;k--)
            if(x%k==0 && y%k==0)
                return k;
        return 1;
    }

    public static void main(String args[]){
        int m=24,n=28;
        swap(m,n);
        System.out.println(m+","+n);
        int a[]=new int[2];
        System.out.println(a[0]+","+a[1]);
        swap2(a);
        System.out.println(a[0]+","+a[1]);
        System.out.println(comm(24,78));
        System.out.println(comm(6,9));
    }
}

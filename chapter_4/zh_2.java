/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_4;

import java.io.*;


public class zh_2 {
    public static void main(String agrs[])throws IOException{
        int a[]=new int[10];
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        //获取数据给数组赋值
        for(int n=0;n<a.length;n++){

            a[n]=Integer.parseInt(buf.readLine());
        }
        //排序前的数组输出
        System.out.print("排序前...");
        for(int n=0;n<a.length;n++){
            System.out.print(" "+a[n]);
        }

        sort(a);

        //将排序后的数组输出
        System.out.println();
        System.out.print("排序后...");
        for(int n=0;n<a.length;n++){
            System.out.print(" "+a[n]);
        }

    }
    //将数组a按由小到大排序
    static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}


/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_4;

public class zh_1 {
    public static void main(String args[]){
        int a[][]=new int[4][4];
        int s=0;
        //用随机函数给数组赋值
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                a[i][j]=(int)(Math.random()*10);
        //按行列输出数组
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.print("\t"+a[i][j]);
            System.out.println();
        }
        //求最外一圈元素之和
        for(int j=0;j<a.length;j++){
            s+=a[0][j];
            s+=a[a.length-1][j];
        }
        for(int i=1;i<a.length-1;i++){
            s+=a[i][0];
            s+=a[i][a.length-1];
        }
        System.out.println("最外一圈元素之和="+s);
        /*主对角线中最大元素的值及其位置*/
        int pos=0;
        for(int k=1;k<a.length;k++){
            if(a[k][k]>a[pos][pos])
                pos=k;
        }
        System.out.println("主对角线中最大元素的值为a[" +pos+"]["+pos+"]=" +a[pos][pos]);
    }
}

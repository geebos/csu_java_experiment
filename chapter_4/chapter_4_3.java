/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_4;

public class chapter_4_3 {
    public static void main(String args[]) {
        //产生矩阵
        int n = 6;
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                matrix[i][k] = (int)(Math.random() * 20 + 10);
                System.out.print(matrix[i][k]+" ");
            }
            System.out.print("\n");
        }

        //求最大元素及其所有出现过的位置
        int num = 0;
        int location[][] = new int[10][2];
        int max = 0;
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(matrix[i][k] > max){
                    max = matrix[i][k];
                    location[0][0] = i + 1;
                    location[0][1] = k + 1;
                    num = 1;
                }
                else if(matrix[i][k] == max){
                    location[num][0] = i + 1;
                    location[num][1] = k + 1;
                    num++;
                }
            }
        }
        System.out.println("最大元素为："+max+"，所有出现的位置如下：");
        for(int i=0;i<num;i++){
            System.out.println(location[i][0]+"行,"+location[i][1]+"列");
        }

        //求矩阵的转置
        System.out.println("原矩阵的转置为：");
        int r_matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                r_matrix[i][k] = matrix[k][i];
                System.out.print(r_matrix[i][k]+" ");
            }
            System.out.print("\n");
        }
    }
}

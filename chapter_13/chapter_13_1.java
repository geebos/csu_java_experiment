/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_13;

import java.io.*;

public class chapter_13_1 {
    public static void main(String[]args){
        int[]intArray={1,2,3,4,5};
        int j;
        try{
            DataOutputStream out=new DataOutputStream(
                    new FileOutputStream("data.dat"));
            for(j=0;j<intArray.length;j++)
                out.write(intArray[j]);//
            out.close();
            DataInputStream in=new DataInputStream(
                    new FileInputStream("data.dat"));//
            while(in.available()!=0){
                j=in.readInt();
                System.out.println(j);
            }
            in.close();

        }catch(IOException e){}
    }
}


/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_13;

import java.io.*;

public class chapter_13_2 {
    public static void main(String args[])throws Exception{
        long filePoint=0;
        String s;
        RandomAccessFile file=new RandomAccessFile("file1.txt","r");
        long fileLength=file.length();
        while(filePoint<fileLength){
            s=file.readLine();
            System.out.println(s);
            filePoint=file.getFilePointer();
        }
        file.close();
    }
}

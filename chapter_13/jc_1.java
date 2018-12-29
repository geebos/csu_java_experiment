/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_13;

import java.io.*;

public class jc_1 {
    public static void main(String args[]){
        if(args.length<2){
            System.out.println("usage:java CopyFile sourcefile targetfile");
            System.exit(0);
        }
        byte[]b=new byte[1024];
        try{
            FileInputStream infile=new FileInputStream(args[0]);
            FileOutputStream targetfile=new FileOutputStream(args[1]);
            while(true){
                int byteRead=infile.read(b);
                if(byteRead==-1)
                    break;
                targetfile.write(b,0,byteRead);
            }
            targetfile.close();
            System.out.println("copy success!");
        }catch(IOException e){}
    }
}


/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_14;

import java.io.*;
import java.util.*;

public class chapter_14_2{
    private int acount;

    public static void main(String args[]) {
        System.out.println(new chapter_14_2().input());
    }

    public int input() {
        acount=0;
        ArrayList<String> a = new ArrayList<String>();
        try {
            Scanner scan = new Scanner(new File("D:\\JAVA\\experiment\\src\\chapter_14\\123.txt"));

            while(scan.hasNextLine()) {
                String str=scan.nextLine();
                a.add(str);
            }

            Iterator it = a.iterator();

            for(;it.hasNext();) {
                String string = (String)it.next();
                char ch=string.charAt(0);
                if(Character.compare(ch, 'A')==0) {
                    acount++;
                }
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        return acount;
    }
}


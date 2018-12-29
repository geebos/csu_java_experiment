/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_14;

import java.io.*;
import java.util.Scanner;
public class jc_1<T> {
    private T obj[];

    public jc_1(T obj[]) {
        this.obj=obj;
    }

    void output() {
        for(int k=0;k<obj.length;k++) {
            System.out.print(" "+obj[k]);
        }

        System.out.println();
    }

    public static void main(String [] args) {
        String a[]= {"good","bad","bye","fine"};

        jc_1<String> x1 = new jc_1<String>(a);
        x1.output();

        Integer b[]= {1,6,3,7,2};

        jc_1<Integer> x2 = new jc_1<Integer>(b);
        x2.output();
    }
}

/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_9;

import javax.swing.*;

public class jc_1 {
    public static void main(String a[]){
        try{
            String word[]={"good","bad","ok","bye"};
            String s=JOptionPane.showInputDialog("请输入一个数： ");
            int n=Integer.parseInt(s);
            System.out.println(word[n]);
        }
        catch(NumberFormatException e){
            System.out.println("要求输入整数");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组访问出界");
        }
        catch(Exception e){
            System.out.println("出现异常");
        }
        finally {
            System.out.println("执行了finally块");
        }
    }
}
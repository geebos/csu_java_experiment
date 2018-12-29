/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_16;

import java.net.*;

public class chapter_16_1 {
    public static void main(String args[]) {
        String host = "www.baidu.com";
        int begin = 70;
        int end = 88;

        Socket s = null;
        for(int port=begin;port<end;port++){
            try{
                s = new Socket(host, port);
                System.out.println("可连接的端口："+port);
            }catch (Exception e){
                System.out.println("不可连接的端口："+port);
            }
        }
    }
}

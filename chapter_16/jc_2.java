/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_16;

import java.net.*;

public class jc_2 {
    public static void main(String args[]){
        try{
            String myaddr=InetAddress.getLocalHost().getHostAddress();
            System.out.println("本机的IP地址："+myaddr);

        }catch(UnknownHostException e){}
    }
}


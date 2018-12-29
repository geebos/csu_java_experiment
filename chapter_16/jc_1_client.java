/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_16;

import java.net.*;
import java.io.*;


public class jc_1_client {
    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost",5432);//创建客户端socket
            OutputStream os = socket.getOutputStream();//获取输出流，发送信息
            PrintWriter pw = new PrintWriter(os);//将输出流包装成打印流
            pw.write("用户名:admin;密码:123");
            pw.flush();
            socket.shutdownOutput();

            //获取输入流
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info = null;

            while((info=br.readLine())!=null) {
                System.out.println("我是客户端,服务器说:"+info);
            }

            br.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        }catch(IOException e) {}
    }
}


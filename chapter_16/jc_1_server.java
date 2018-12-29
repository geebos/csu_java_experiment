/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_16;

import java.net.*;
import java.io.*;

public class jc_1_server {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5432);

        while(true) {
            Socket socket = serverSocket.accept();//开始监听,等待客户端连接
            InputStream is = socket.getInputStream();//字节流
            InputStreamReader isr = new InputStreamReader(is);//字符流
            BufferedReader br = new BufferedReader(isr);//过滤字符流
            String info = null;

            while((info = br.readLine())!=null) {
                System.out.println("我是服务器,客户端说:"+info);
            }

            socket.shutdownInput();//关闭输入流

            //获取输出流,响应客户端要求
            OutputStream os =socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("欢迎你！");
            pw.flush();

            //关闭资源

            pw.close();
            os.close();
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
        }
    }
}


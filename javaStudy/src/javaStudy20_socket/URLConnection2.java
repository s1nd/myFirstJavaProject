package javaStudy20_socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection2 {
    public static void main(String[] args) throws IOException {
//        httpConnection();
        downTypora();
    }
    public static void downTypora() throws IOException {
        URL url = new URL("https://www.typora.io/windows/typora-setup-x64.exe");
        URLConnection con = url.openConnection();
        System.out.println(con.getContentType());
    }
    public static void httpConnection() throws IOException {
        URL url = new URL("http://img.8ryx.com/uploads/zedit/2017-12-28/20171228141258_63863.jpg");
        URLConnection con = url.openConnection();
        InputStream in = url.openStream();
        OutputStream ou = new FileOutputStream("src/javaStudy20_socket/1.png");
        byte[] b = new byte[1000];
        int n = 0;
        while((n=in.read(b))!=-1){
//            for(int i=0;i<1000;i++){
//                System.out.print((char)b[i]);
//            }
//            ou.write(b,0,n);
//            System.out.println("n is: "+n);
        }
        in.close();
        ou.close();
        System.out.println();
        System.out.println(con.getHeaderFields());
        System.out.println(con.getContentLength());
        System.out.println(con.getContentType());
        System.out.println(con.getURL());
    }
}

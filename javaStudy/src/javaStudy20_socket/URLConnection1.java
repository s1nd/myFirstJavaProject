package javaStudy20_socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection1 {
    public static void main(String [] args) throws IOException {
        fileProtect();
    }
    public static void fileProtect() throws IOException {

        URL url = new URL("file:///H:/Test/URLConnectionTest.txt");
        URLConnection con = url.openConnection();
        System.out.println(con.getHeaderFields());//{}
        InputStream in = url.openStream();
//        System.out.println(in.);
        byte[] b = new byte[10];
        while((in.read(b))!=-1){
//            System.out.println(b.toString());
            for(byte bi:b){
                System.out.print((char)bi);
            }
        }
        in.close();
    }
}

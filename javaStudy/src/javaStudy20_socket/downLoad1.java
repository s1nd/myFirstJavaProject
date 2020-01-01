package javaStudy20_socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.http.HttpRequest;
import java.time.Duration;

public class downLoad1 {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        URI url = new URI("http://www.baidu.com");
        URL url = new URL("http://img.8ryx.com/uploads/zedit/2017-12-28/20171228141258_63863.jpg");

//        HttpRequest httprequest = HttpRequest.newBuilder(url).timeout(Duration.ofSeconds(5)).build();
        URLConnection con = url.openConnection();
//        try{
//
//        }catch(){
//
//        }
        InputStream in = con.getInputStream();
        OutputStream out = new FileOutputStream("src/javaStudy20_socket/1.jpg");
//        long len = in.
        byte[] b = new byte[10];
        while (in.read(b)>0){
            out.write(b);
        }
        in.close();
        out.close();

    }
}

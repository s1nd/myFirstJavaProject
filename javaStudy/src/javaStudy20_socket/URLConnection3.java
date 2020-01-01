package javaStudy20_socket;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection3 {
//    OutputStream ou = new FileOutputStream("src/javaStudy20_socket/7zip.exe");
      final static String targetPath = "src/javaStudy20_socket";
//      final static File ou  = new File(targetPath+"/7z1900-x64.exe");
      final static File ou  = new File(targetPath+"/half.jpeg");
      static URL url = null;
      static int ThreadNum = 0;
    public URLConnection3(String url,int ThreadNum) throws MalformedURLException {
        this.url = new URL(url);
        this.ThreadNum = ThreadNum;
    }

    public static void main(String[] args) throws IOException {
//        downExe();
        Thread t = new Thread(new down());
        t.start();
    }


    public static void downExe() throws IOException {
        URL url  = new URL("https://www.7-zip.org/a/7z1900-x64.exe");
        URLConnection con = url.openConnection();
        InputStream in = url.openStream();
        OutputStream ou =  new FileOutputStream("src/javaStudy20_socket/7zip.exe");
        int n = 0;
        System.out.println(con.getContentLength());
        byte[] b = new byte[1024];
        while((n = in.read(b))!=-1){
            ou.write(b,0,n);
        }
        System.out.println(con.getContentType());
        in.close();
        ou.close();
    }
}
class down implements Runnable{
    int start;
    int end;
    int singleLen;
    String taskName;
    String url;
    down(){}
    down(int start, int end, String taskName,String url){
        this.end = end;
        this.start = start;
        this.taskName = taskName;
        this.url =url;
    }
    public void run(){
        try{
//            URL url= new URL("https://www.7-zip.org/a/7z1900-x64.exe");
            URL url= new URL("http://img.8ryx.com/uploads/zedit/2017-12-28/20171228141258_63863.jpg");
//            InputStream in = url.openStream();
            URLConnection con = url.openConnection();
            con.setRequestProperty("Range","bytes=1-10240");
            InputStream in = con.getInputStream();
            System.out.println(con.getContentLength());
            System.out.println(con.getContentType());
            RandomAccessFile raf = new RandomAccessFile(URLConnection3.ou,"rw");
            int n = 0;
            byte[] b = new byte[1000];
            while((n=in.read(b))!=-1){
                raf.write(b);
            }
            in.close();
            raf.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

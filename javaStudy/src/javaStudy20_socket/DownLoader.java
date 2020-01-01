package javaStudy20_socket;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//文件容错？？
public class DownLoader {
    static int size ;
    static int singleLength;
    static String strUrl = null;
    static int ThreadNum = 3;//默认线程数3
    static int segment = 0;//如何将segment与ThreadNum关联起来
//    Path dir;
    String dir="C:";//默认存储在c盘
    static File ou = null;
    static ExecutorService es;
    static int[] ops=new int[ThreadNum];//支持断点续传
    DownLoader(String strUrl, String dir ,int threadNum){
        this.strUrl = strUrl;
//        this.dir = dir;
        this.dir = dir;
        this.ThreadNum = threadNum;

        //创建输出文件,文件类型与链接后缀一致
        //文件名取最后一个"/"后面字符
        this.ou  = new File(dir+"/"+strUrl.substring(strUrl.lastIndexOf("/")+1));
        System.out.println(ou.getPath());
        es = Executors.newFixedThreadPool(ThreadNum);
    }

    public DownLoader(String dir) {
        this.dir = dir;
    }

    public static void main(String[] args) throws IOException {
        DownLoader d = new DownLoader(
//                "http://img.8ryx.com/uploads/zedit/2017-12-28/20171228141258_63863.jpg",
                "https://www.7-zip.org/a/7z1900-x64.exe",
                "src/javaStudy20_socket",
                5);
        d.start();
    }
    public void  start() throws IOException {
        //线程和分段数一样

        //创建一个URLconnection获取文件大小
        URL url = new URL(strUrl);
        size = url.openConnection().getContentLength();
        System.out.println(size);
        //计算单个文件segment长度
        singleLength = size/ThreadNum+1;

        //使用断言,文件过大终止程序
        assert size>(1<<32)-1:"file is too big";

        //添加任务
        for(int i=0;i<ThreadNum;i++){
            es.submit(new singleDown(singleLength*i, singleLength*(i+1),i));
        }
        //启动有序关闭
        es.shutdown();
//        System.out.println("ThreadPoll end");
    }
    public void stop(){
        es.shutdownNow();
        if(es.isShutdown()){
            System.out.println("threadpool has been stopped");
        }
    }
    public void resume(){
        for(int i=0;i<ThreadNum;i++){
            es.submit(new singleDown(ops[i], singleLength*(i+1),i));
        }
        //启动有序关闭
        es.shutdown();
    }
}
class singleDown implements Runnable{
    final String strUrl = DownLoader.strUrl;
    int[] ops = DownLoader.ops;
    final File ou = DownLoader.ou;
    //下载小于4GB的文件
    final int start ;
    final int end ;
    int index;
    String taskName;
    singleDown(int start,int end,int index){
        this.end = end;
        this.start = start;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is start at:"+start);
        try{
            URL url = new URL(strUrl);
            URLConnection con = url.openConnection();
            con.setRequestProperty("Range","bytes="+start+"-"+end);
            InputStream in = con.getInputStream();
            RandomAccessFile raf = new RandomAccessFile(ou,"rw");

            //移动文件指针，从指定位置开始写文件
            raf.seek(start);

            int n;
            byte[] b = new byte[4096];
            while((n=in.read(b))!=-1){
                raf.write(b,0,n);
                //每次写完文件记录文件指针位置
                ops[index] = (int)raf.getFilePointer();
            }

            //关闭输入输出流
            in.close();
            raf.close();
        }//可以删掉第一个异常
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" is end");
    }
}

package javaStudy18_io;

import java.io.*;

public class FileCopy1 {
    static final String srcPath = "src/javaStudy18_io/"+"timg.jpg";
    static final String tarPath = "src/javaStudy18_io/"+"t.jpg";
    static final File inf = new File(srcPath);
    private static final File outf = new File(tarPath);

    public static void main(String[] args)throws IOException {
        if(inf.exists()){
//            inf.createNewFile();
            System.out.println("srcFile is not exist!");
        }
        try (InputStream input = new FileInputStream(inf)){
            try(OutputStream output = new FileOutputStream(outf)){
                byte[] buffer = new byte[1000];
                int n;
                while((n = input.read(buffer))!=-1){
                        output.write(buffer);
                }
            }

        }

    }
    public void exist1(){
        if(inf.exists()){
            System.out.println("inf is exist");
        }
        if(outf.exists()){
            System.out.println("outf is exist");
        }
    }
}

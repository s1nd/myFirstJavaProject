package Do12_1.first;

import Do12_1.first.Students;

import java.io.*;
import java.util.*;

public class Serialize1 {
    public static void main(String[] args) throws IOException {
        Students Ben = new Students("Ben");
        Ben.setName("Lee");
        Ben.setAge(15);
        Ben.setScore(87f);
        Students Ben1 = new Students("Ben");
        Ben1.setName("Lee");
        Ben1.setAge(16);
        Ben1.setScore(87.4f);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("H:/Do12_1"));
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("H:/Do12_1"));


        //set通过equals(先判断) 和hash判断
        Set stuset = new HashSet();
        List<Students> stu = new ArrayList<Students>();
//        List<Students> stu = new ArrayList<Students>(){
//            public int compare (int a) -> {
//
//            }
//        }
        stu.add(Ben);
        stu.add(Ben1);
        stuset.add(Ben);
        stuset.add(Ben1);
//        System.out.println(Ben);
        Ben.getScore();
        Ben1.getScore();
//        Collections.sort(stu);
        System.out.println(Ben.hashCode());
        System.out.println(Ben1.hashCode());
        System.out.println(stuset.size());

    }



}

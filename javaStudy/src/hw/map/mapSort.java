package hw.map;

import java.util.*;

public class mapSort {
    public static void main(String[] args){
        //声明班级里所有的学生
        List<Students> class1 = new ArrayList<>();
        Students m = new Students("xiaoming",16);
        Students q =  new Students("xiaoqiang",17);
        Students h = new Students("xiaohua",16);
        Students ho = new Students("xiaohong",18);
        class1.add(m);
        class1.add(q);
        class1.add(h);
        class1.add(ho);
        Map<String, Students> Stu2Index = new HashMap<>();
//        Stu2Index.put("good", )

//        查找
        int i = class1.indexOf(ho);
//        System.out.println(i);

//        排序
        System.out.println(class1);
//        Collections.sort(class1);
//        System.out.println(class1);
    }

}

 class Students{
    String name;
//     int height;
//     int weight;
//     int sight;
    int age;
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }
 }
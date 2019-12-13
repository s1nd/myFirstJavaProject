package Do12_1.first;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Students implements Serializable, Comparator {
    private String name = null;
    private int age = 0;
    private float score = 0f;
    Students(String name){
        this.name = name;
    }
    public void setName(String na){
        name = na;
    }

    @Override
    public int compare(Object o, Object t1) {
        return ((Students)o).score- ((Students)t1).score>0?1:-1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return
//                age == students.age &&
                Float.compare(students.score, score) == 0 &&
                name.equals(students.name);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
//        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(score);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    void setAge(int a){
        age = a;
    }
    void setScore(float s){
        score = s;
    }
    void getName(){
        System.out.println(name);
    }
    void getAge(){
        System.out.println(age);
    }
    public void setAge(){
        System.out.println(age);
    }
    void getScore(){
        System.out.println(score);
    }
}

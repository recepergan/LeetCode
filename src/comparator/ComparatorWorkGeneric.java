package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWorkGeneric {
    public static void main(String[] args) {
        ArrayList<Student1> all=new ArrayList<Student1>();
        all.add(new Student1(101,"Vijay",23));
        all.add(new Student1(106,"Ajay",27));
        all.add(new Student1(105,"Jai",21));

        System.out.println("Sorting by Name");

        Collections.sort(all,new NameComparatorr());
        for(Student1 st: all){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(all,new AgeComparatorr());
        for(Student1 st: all){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}

class Student1 {
    int rollno;
    String name;
    int age;

    Student1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparatorr implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparatorr implements Comparator<Student1>{
    public int compare(Student1 s1,Student1 s2){
        return s1.name.compareTo(s2.name);
    }
}

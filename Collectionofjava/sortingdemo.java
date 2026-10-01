package Collectionofjava;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollno;
    int marks;
    Student(String n,int r,int m){
        name = n;
        rollno = r;
        marks = m;
    }
    @Override 
    public int compareTo(Student o){
        return this.rollno-o.rollno;
    }
    // @Override 
    // public int compareTo(Student o){
    //     return rollno
    // }
}
class CustomComparator implements Comparator<Student>{//comparator is always created outside the class whereas comparable is created within the class
    public int compare(Student ob1,Student ob2){
        if(ob1.marks != ob2.marks){
            return ob2.marks - ob1.marks;//descending order
        } else{
            return ob1.rollno - ob2.rollno;
        }
    }
}

public class sortingdemo {
    public static void main(String[] args) {
        ArrayList<Integer>i = new ArrayList<>();
        i.add(23);
        i.add(12);
        i.add(14);
        i.sort(null);

        System.out.println(i);
        i.sort(Collections.reverseOrder());//comparator for descending order
        System.out.println(i);
        ArrayList<Student>st = new ArrayList<>();
        st.add(new Student("rahul", 1,100 ));
        st.add(new Student("Nitesh", 10,100 ));
        st.add(new Student("Neetesh", 7,100 ));
        st.add(new Student("Mitesh", 9,100 ));
        st.sort(null);//comparable
        System.out.println(st); 
        st.sort(new CustomComparator());//comparator
        System.out.println(st); 
    }
    
}

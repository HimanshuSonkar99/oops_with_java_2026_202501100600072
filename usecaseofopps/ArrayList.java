package usecaseofoops

import java.util.ArrayList;
public class ArrayList{
    public static void addMarks(List<Integer>marks,int marks){
        marks.add(marks);
    }
    public static double calculateAverage(List<Integer>marks){
        double sum = 0.0;
        for(int i:marks){
            sum +=i;
        }
        return 
    }
}

public class usecase6 {
       public static void main(String[] args) {
 
       ArrayList<Student> students = new ArrayList<>();
 
       Student s1 = new Student("Rahul", 101);
 
       try {
           s1.addMarks(85);
           s1.addMarks(90);
           s1.addMarks(-10);   // Exception
           s1.addMarks(78);
       }
       catch (NegativeMarksException e) {
           System.out.println("Exception: " + e.getMessage());
       }
 
       students.add(s1);
 
       for (Student s : students) {
           s.display();
       }
   }
}

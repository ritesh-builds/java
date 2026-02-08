package HEAPS;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollNo;
    double cgpa;
    Student(String name, int rollNo,double cgpa){
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        return (int)(this.rollNo - s.rollNo);
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Ritesh",55,9.8);
        Student s2 = new Student("Saanvi",89,8.0);
        Student s3 = new Student("Isha",54,8.9);
        Student s4 = new Student("Ishika",67,8.8);
        Student s5 = new Student("Viksit",66,7.8);

        Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
        for(Student ele: arr){
            System.out.println("Name: "+ele.name+" Roll No: "+ele.rollNo+" CGPA: "+ele.cgpa+" ");
        }
    }
}

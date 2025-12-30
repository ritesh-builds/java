package OOPs;
import java.util.*;
class Student {
    String name;
    private int RollNum;
    double cgpa;

    void print(){
        System.out.println("Roll Number: "+RollNum);
    }
    int getRno(){
//        System.out.println("Roll Number: "+RollNum);
        return RollNum;
    }
    void setRollNo(int x){
        RollNum = x;
    }
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Tanya";
//        s1.RollNum = 2414128;
        s1.cgpa = 8.8;
        System.out.println("Name: "+s1.name);
//        System.out.println("Roll Number: "+s1.RollNum);
        System.out.println("CGPA is: "+s1.cgpa);
        s1.print();
        System.out.println(s1.getRno());

        s1.setRollNo(22);
        System.out.println(s1.getRno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }

}


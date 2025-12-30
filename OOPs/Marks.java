package OOPs;

import java.util.Arrays;

public class Marks {
     public static class StudentData{
        String name;
        int rno;
        int[] marks;


        StudentData(int s){
            marks = new int[s];
        }
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }
     }
    public static void main(String[] args) {
         int[] arr = {3,5,7,2,6,9,1};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(6);
        s1.marks[0] = 89;
        s1.marks[1] = 79;
        s1.marks[2] = 59;
        s1.marks[3] = 99;
    }
}

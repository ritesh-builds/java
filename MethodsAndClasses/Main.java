package MethodsAndClasses;
class Student {
    int age = 20;
    String StudentName;
}
class child{
    int roll = 10;
    String name;
}
public class Main {
    public static void main(String[] args) {
        System.out.println("This is an obect obj1 in student.");
       Student obj1 = new Student();
       obj1.age = 20;
       obj1.StudentName = "Ritesh";
        System.out.println(obj1.age);
        System.out.println(obj1.StudentName);

        System.out.println("This is an obect obj2 in student.");
        Student obj2 = new Student();
        obj2.StudentName = "Lucky";
        obj2.age = 10;
        System.out.println(obj2.age);
        System.out.println(obj2.StudentName);

        System.out.println("This is an obect obj3 in child.");
        child obj3 = new child();
        obj3.name = "Lucky";
        obj3.roll = 1;
        System.out.println(obj3.name);
        System.out.println(obj3.roll);
    }
}

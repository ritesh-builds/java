package OOPs;

class car {
    double Length;
    double Engine;
    double Speed;
    String Name;
    String type;
}
public class userDefinedDataTypes {
    public static void main(String[] args) {

        Student Obj = new Student();   // creating a new object or decelaration.
        Obj.cgpa = 8.8;
        Obj.name = "Ritesh Kumar";
        Obj.rNo = 2414055;

        System.out.println(Obj.cgpa);
    }
    public static class Student{
        String name;
        int rNo;
        double cgpa;

    }
}

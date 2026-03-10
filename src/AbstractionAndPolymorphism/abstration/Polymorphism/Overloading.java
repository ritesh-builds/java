package AbstractionAndPolymorphism.abstration.Polymorphism;

public class Overloading {

    Overloading(){
        System.out.println("Default Overloading Constructor called...");
    }

    Overloading(int a, int b){
        System.out.println("Overloading Constructor called...");
    }
    Overloading(int a){
        System.out.println("Overloading Constructor called...");
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    static void main(String[] args) {
        Overloading overload = new Overloading();
        int sum = overload.add(1, 2);
        System.out.println(overload.add(1,sum));

        System.out.println(overload.add(1,2,3));
    }
}

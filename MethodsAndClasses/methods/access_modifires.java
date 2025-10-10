package MethodsAndClasses.methods;

public class access_modifires {
    public String str1 = "I am a public member";

    void printFromClass(){
        System.out.println("Within class: " + str1);
    }

    public static void main(String[] args) {
        access_modifires obj1 = new access_modifires();
        obj1.printFromClass();
        System.out.println(obj1.str1);

        access_modifires.app2 obj2 = obj1.new app2();
        obj2.printFromOutSideClass();
    }

    class app2 {
        void printFromOutSideClass() {
            access_modifires obj = new access_modifires();
            System.out.println("withinClass but outside package: " + obj.str1);
        }
    }
}


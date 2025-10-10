package MethodsAndClasses.methods;

class Algebra{
    int a = 10;
    int b = 20;

    int add(){
        return a + b;
    }
    int sub(){
        return a - b;
    }
    void demo(){
        int p = 100;
        System.out.println(p);
        {
           int q = 20;
            System.out.println(q);
        }
        {
            int r = 1234;
            System.out.println(r);
        }
    }
}
public class main {
    public static void main(String[] args) {
      Algebra obj =  new Algebra();
       obj.demo();
       obj.sub();
       obj.add();
    }
}

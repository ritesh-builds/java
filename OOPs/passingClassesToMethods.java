package OOPs;

public class passingClassesToMethods {
   public static class Car {
        double Length;
        double Engine;
        double Speed;
        String Name;
        String type;
        void print(){
            System.out.println(Length+", "+Engine+", "+Speed+", "+Name+", "+type);
        }

    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.Engine = 1.2;
        c1.Length = 5;
        c1.Name = "City";
        c1.Speed = 200;
        c1.type = "Suv";

        Car c2 = new Car();
        c2.Engine = 1.2;
        c2.Length = 4;
        c2.Name = "Nexon";
        c2.type = "Suv";
        c2.Speed = 220;

        System.out.println(c1.Name);

        change(c1);
        System.out.println(c1.Name);

        c1.print();
        c2.print();
    }
    private static void change(Car c){
        c.Name = "Venue";
    }
}

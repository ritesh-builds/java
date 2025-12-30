package OOPs;

public class Constructors {

    public static class Car {
        int seats;
        String name;
        double length;
        Car(){ // default constructor.

        }

        Car(int seats,String name,double length){
            this.seats = seats;
            this.name = name;
            this.length = length;
        }
        void print(){
            System.out.println("Name: "+name+", Seats: "+seats+", Length: "+length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Venue",4.1);
        c1.print();
        Car c2 = new Car(7,"Scorpio",5.6);
        c2.print();
    }
}

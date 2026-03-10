package Inheritance;

public class Vehicle {
    public int noOfTypres;
    public void commute(){
        System.out.println("I am going from pace A to place B using "+noOfTypres+" tyres...");
    }

    public static void main() {
        Vehicle v1 =  new Vehicle();
        v1.noOfTypres = 1;
        v1.commute();
    }

    @Override
    public String toString(){
        return "Vehicle number of tyres: "+noOfTypres;
    }
}

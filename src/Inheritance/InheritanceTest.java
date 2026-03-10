package Inheritance;

public class InheritanceTest {
    static void main() {
        Vehicle vehicle = new Vehicle();
        TwoWheeler twoWheeler = new TwoWheeler();
        vehicle.commute();
        twoWheeler.commute();

        System.out.println(vehicle.toString());
        System.out.println(vehicle.noOfTypres);
        System.out.println(vehicle.hashCode());
    }
}

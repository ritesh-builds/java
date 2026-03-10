package AbstractionAndPolymorphism.abstration.Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        castTest(car);
        castTest(plane);

        car.start();
        plane.start();
    }

    private static void castTest(Vehicle vehicle) {
       vehicle.start();

       if(vehicle instanceof Car){
           System.out.println("Yes...");
       }else{
           System.out.println("No...");
       }
    }
}

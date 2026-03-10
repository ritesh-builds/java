package Incapsulation;

import GettersAndSttters.Car;
import org.w3c.dom.ls.LSOutput;

public class GetterTest {

    public static void main() {
        Car car =  new Car("Black", "MAHINDRA XUV 7XO AX7L", 20.89,2700000);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.printf("Color of car is %s and model is %s", car.getColor(), car.getModel());
    }
}

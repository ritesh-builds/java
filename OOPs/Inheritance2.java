package OOPs;
class Vehicle{
    int speed;
    int wheels;
    int seats;
}
class Powervehicle extends Vehicle{
    int engine;
}
class AirCrafts extends Powervehicle{
    int rotors;
}
class Animals{
    int size;
    boolean isVegetarian;
}
class Birds extends Animals{
    int maximumAltitude;
}
class AquaticAnimals extends Animals{
    int fins;
}
public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();

    }
}

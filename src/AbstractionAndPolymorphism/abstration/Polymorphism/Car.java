package AbstractionAndPolymorphism.abstration.Polymorphism;

public class Car extends Vehicle {

    Car(){
        super();
    }

    public int noOfDoors(){
        return 5;
    }
    Car (int noOfTyres){
        super(noOfTyres);
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("The car is starting up...");
    }
}

package AbstractionAndPolymorphism.abstration.Abstraction;

public abstract class Vehicle implements Transport {
    private int NoOfTyres;

    public abstract void makeStartSound();

    public Vehicle(int noOfTyres){
        this.NoOfTyres = noOfTyres;
    }


    @Override
    public void getSetGo() {
        System.out.println("going to place..");
    }

    public int getNoOfTyres() {
        return NoOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        NoOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Vehicle Commuted...");
    }
}

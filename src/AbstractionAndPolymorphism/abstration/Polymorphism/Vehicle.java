package AbstractionAndPolymorphism.abstration.Polymorphism;

public abstract class Vehicle {
   private int noOfTyres;
   Vehicle(){
    this.noOfTyres=0;
   }

   Vehicle(int noOfTyres){
      this.noOfTyres = noOfTyres;
   }

   public int getNoOfTyres(){
      return noOfTyres;
   }

   public void start() {
      System.out.println("Vehicle is start...");
   }

}

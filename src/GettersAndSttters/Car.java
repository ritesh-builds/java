package GettersAndSttters;

public class Car {
    private String color;  // public access
    private String model;  // public access
    private double fuelLevel;
    private long costOfPurchase;  // default access

    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

    void setColor(String color){
        if(color.equals("Yellow")){
            System.out.println("This color is not allowed...");
        }
        else{
            this.color = color;
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }



    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }
}

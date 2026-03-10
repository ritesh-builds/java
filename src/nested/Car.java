package nested;

public class Car {

    private int noOfDoors;


    void repair(){
        Tyre t = new Tyre();
    }
    protected class Tyre {
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors = 4;
        }
    }

}

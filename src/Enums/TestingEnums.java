package Enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLights color =  TrafficLights.RED;
        color = TrafficLights.GREEN;

        Grade grade =   Grade.valueOf("D");

        for (Grade value : Grade.values()) {
            System.out.println(value.toString());
        }


    }
}

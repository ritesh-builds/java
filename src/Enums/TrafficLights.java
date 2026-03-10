package Enums;

public enum TrafficLights {
    RED("STOP"), GREEN("GO"), YELLOW("READY");
    private final String action;
     TrafficLights(String action) {
        this.action = action;
    }
}

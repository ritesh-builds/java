package MultiThreading.Problem_4;

public enum TrafficColor {
    RED(9000), YELLOW(1000), GREEN(3000);

    private int onTimeInMilliseconds;

    TrafficColor(int onTimeInMilliseconds) {
        this.onTimeInMilliseconds = onTimeInMilliseconds;
    }

    public int getOnTimeInMilliseconds() {
        return onTimeInMilliseconds;
    }
}

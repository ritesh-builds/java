package MultiThreading.Problem_4;

public class Road {
    static void main() throws InterruptedException {
       TrafficLightThread t1 = new TrafficLightThread(TrafficColor.RED);
       TrafficLightThread t2 = new TrafficLightThread(TrafficColor.GREEN);
       TrafficLightThread t3 = new TrafficLightThread(TrafficColor.YELLOW);

       t1.start();
       t1.join();
       t2.start();
       t2.join();
       t3.start();
       t3.join();
    }
}

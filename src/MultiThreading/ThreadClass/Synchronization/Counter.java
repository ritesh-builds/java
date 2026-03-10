package MultiThreading.ThreadClass.Synchronization;

public class Counter {
    private int count = -2;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

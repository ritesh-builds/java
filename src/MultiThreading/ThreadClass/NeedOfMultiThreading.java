package MultiThreading.ThreadClass;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+"* ");
        }
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+"$ ");
        }
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+"# ");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal time taken: "+(endTime-startTime)+" ms");
    }
}

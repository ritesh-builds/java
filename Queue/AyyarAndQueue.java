package Queue;

public class AyyarAndQueue {
    public static class QueueArr {
        int[] arr = new int[10];
        int idx = 0;
        int f = -1;
        int r = -1;

        void add(int x) {
            if (r == arr.length - 1) {
                System.out.println("Queue is OVERFLOW!");
                return;
            }
            if (f == -1) {
                f = 0;
                r = 0;
            } else {
                r++;
            }
            arr[r] = x;
            idx++;
        }

        int remove() {
            if (idx == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int val = arr[f];
            f++;
            idx--;
            return val;
        }

        public int peek() {
            if (idx == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty() {
            return idx == 0;
        }

        public void display() {
            if (idx == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueArr q = new QueueArr();

        q.add(10);
        q.add(20);
        q.add(30);

        q.display(); // 10 20 30

        System.out.println("Removed: " + q.remove());
        q.display(); // 20 30

        System.out.println("Peek: " + q.peek()); // 20
    }
}


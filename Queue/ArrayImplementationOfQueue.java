package Queue;
public class ArrayImplementationOfQueue {
    public static class queueA{
        int f = -1;               // front index
        int r = -1;               // rear index
        int size = 0;
        int[] arr = new int[100];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full.");
                return;
            }
            if(size == 0) {
                // First push
                f = r = 0;
                arr[r] = val;     // Add the first value at arr[0]
            }
            else{
                r = r + 1;       // Increment rear
                arr[r] = val;    // Store value at new rear index
            }
            size++;
        }

        public int remove(){
            if(size > 0) {
                int temp = arr[f]; // Get the front element
                f++;
                size--;
                // If queue becomes empty after removal, reset pointers
                if(size == 0) {
                    f = -1;
                    r = -1;
                }
                return temp;
            }else{
                return -1;
            }
        }

        public int peek(){
            if(size == 0) return -1;
            return arr[f];
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void display(){
            if(size == 0) System.out.println("Queue is empty!");
            else{
                // Loop should go till r (inclusive)
                for(int i = f; i <= r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);    // Output: 1
        q.add(2);    // Output: 1 2
        q.add(3);    // Output: 1 2 3
        q.add(4);    // Output: 1 2 3 4
        q.add(5);    // Output: 1 2 3 4 5
        q.display(); // Output: 1 2 3 4 5
        System.out.println("\n"+q.peek());
    }
}


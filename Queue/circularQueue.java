package Queue;
public class circularQueue {
    public static class CircularQueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int value) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = value;
                size++; // correction: increment size after adding first element
            }
            else {
                rear = (rear + 1) % arr.length; // correction: circular increment
                arr[rear] = value;
                size++; // correction: increment size every add
            }
        }

        int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else {
                int value = arr[front];
                if(size == 1) { // correction: if last element, reset pointers
                    front = rear = -1;
                } else {
                    front = (front + 1) % arr.length; // correction: circular increment
                }
                size--; // correction: decrement size every remove
                return value;
            }
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else return arr[front];
        }

        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is Empty!");
                return;
            }
            int count = 0;
            int i = front;
            while(count < size){ // correction: loop exactly 'size' times
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length; // correction: circular increment
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // Sample test code for usage.
        CircularQueue q = new CircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
    }
}


package Queue;

public class CircularQueueInArray {
    public class CircularQueue{
        int[] arr = new int[100];
        int front = -1;
        int rear = -1;
        int size = 0;
        public void add(int val) throws Exception{
            if(size== arr.length){
                throw new Exception("Queue is Full!");
            } else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            } else if (rear< arr.length-1) {
                rear++;
                arr[rear] = val;
            } else if (rear == arr.length-1) {
                rear = 0;
                arr[0] = val;
            }
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Full!");
            } else{
                int val = arr[front];
                if(front == arr.length-1)    front = 0;
                else front++;
                return val;
            }
        }
        public int peek() throws Exception{
        if(size == 0) throw new Exception("Queue is Empty!");
        else return arr[front];
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        void display(){
            if(size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
           else {
                if(front < rear) {
                    for (int i = front; i < rear; i++) {
                        System.out.print(arr[i] + " ");
                    }
                } else if (front > rear) {
                    for (int i = front; i < arr.length-1; i++) {
                        System.out.print(arr[i]+ " ");
                    }
                    for (int i = 0; i < rear; i++) {
                        System.out.print(arr[i]+ " ");
                    }
                }
            }
        }
    }
}

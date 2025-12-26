package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void add(int data){

        }

        void InsertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        void InsertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void InsertAt( int idx,int val){
            Node t = new Node(val);
            Node temp = head;

            if(idx==size()){
                InsertAtEnd(val);
                return;
            } else if (idx == 0) {
                InsertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Wrong input!");
                return;
            }
            if(head == null){
                System.out.println("ERROR!, List is Empty.");
                return;
            }
            for (int i = 1; i < idx-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int size(){
            Node temp = head;
            int size = 0;
            if(head == null){
                System.out.println("LinkList is Empty.");
                return -1;
            }else{
            while(temp != null) {
                temp = temp.next;
                size++;
            }
            }
//            System.out.print("Size: "+size);
//            System.out.println();
            return size;
        }
        void display(){
             Node temp = head;
            System.out.println();
            System.out.print("Elements are: ");
             while(temp != null){
                 System.out.print(+temp.data+" ");
                 temp = temp.next;
             }
        }
        int getAt(int idx){
            Node temp = head;
            if(idx > size() || idx < 0){
                System.out.println("Invalid input!");
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void InsertAtEnd(Node head,int val){
            Node temp = new Node(val);
            Node t = head;
            while(t.next != null ){
                t = t.next;
            }
            t.next = temp;
        }
        void DeleteAtIndex(int idx){
            Node temp = head;
            if(idx > size() || idx < 0){
                System.out.println("Error!, Invalid Input.");
                return;
            } else if (idx == 0) {
                head = head.next;
                return;
            }
            for (int i = 1; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            System.out.println("deleted!"+" index: "+idx);
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.InsertAt(10,20);
        ll.InsertAtHead(20);
        ll.InsertAtEnd(30);
        ll.InsertAtEnd(40);
        ll.InsertAtEnd(100);
        ll.InsertAtHead(200);
        ll.size();
        ll.display();
        ll.InsertAt(6,300);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(3));
        System.out.println(ll.getAt(0));

        ll.DeleteAtIndex(-1);
        ll.DeleteAtIndex(2);
        ll.DeleteAtIndex(0);
        ll.display();
    }
}

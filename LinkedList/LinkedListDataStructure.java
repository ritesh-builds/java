package LinkedList;
class Node {   // User defined data type.
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{ // User defined data Structure.
    Node head;   // null
    Node tail;   // null
    int size;

void delete(int idx){
    Node temp = head;
    if(idx == 0){
       deleteAtHead();
       return;
    }
    if(idx >= size || idx < 0){
        System.out.print("invalid input!");
        return;
    }
    if(idx == size-1){
        tail = temp;
        size--;
    }
    for (int i = 0; i <= idx-1; i++) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;
}
    void insert(int val,int idx){
        if(idx == size){
            addAtTail(val);
            return;
        }
        if (idx == 0){
            addAtHead(val);
            return;
        }
        if(idx < 0 || idx > size){
            System.out.println("Error!  invalid index.");
            return;
        }
       else{
           Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

//    int search(int val){
//       if(head == null) return -1;
//       Node temp = head;
//       int idx = 0;
//       while(temp != null){
//           if(temp.val == val) return idx;
//               temp = temp.next;
//               idx++;
//        return 1;
//       }
//       return -1;
//    }
int search(int val) {
    Node temp = head;
    int idx = 0;
    while (temp != null) {
        if (temp.val == val) {
            return idx;
        }
        temp = temp.next;
        idx++;
    }
    return -1; // not found
}


    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head == tail) {
            System.out.println("List is EMPTY.");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    void display(){
        if(head == null) return;
        Node temp = head;
       while(temp != null){
           System.out.print(temp.val+" ");
           temp = temp.next;
       }
        System.out.println();
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.addAtTail(100);
        ll.addAtTail(200);
        ll.addAtTail(300);
        ll.addAtTail(400);
        ll.addAtTail(500);

        ll.display();

        ll.addAtHead(600);

        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.print("size: "+ll.size);
        ll.insert(40,3);

        System.out.println();
        ll.display();
        ll.search(40);
        ll.delete(4);
    }
}

package DoublyLinkedList;

public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }

    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
           temp = temp.next;
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp = random;
        // move this temp backward to head.
        while (temp.prev != null){
//            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        // now temp is at head.
        // print the list.
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head,int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        t.prev = null;
        return head;
    }
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        // temp ko tail tkk leke jaana hai pehle.
        while (temp.next != null){
            temp = temp.next;
        }
       Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t;
        t.next = null;

    }
    public static void insertAtAnyIndex(Node head, int idx,int val){

        Node temp = head;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
        t.prev = temp;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(10);
        Node d = new Node(55);
        Node e = new Node(0);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        display2(e);
        displayRandom(c);
        Node newHead =  insertAtHead(a,56);
        display(newHead);

       insertAtTail(a,90);
       display(a);

       insertAtAnyIndex(a,5,70);
       display(a);
    }
}

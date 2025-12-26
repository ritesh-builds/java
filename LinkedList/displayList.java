
package LinkedList;
import java.sql.SQLOutput;
import java.util.*;

public class displayList {
    public static void displayRecursively(Node head) {
//        if(head != null) {
//            System.out.print(head.val + " ");
//            displayRecursively(head.next);
//        }
        if (head == null) return;
        System.out.print(head.val + " ");
        displayRecursively(head.next);
    }

        public  static void revDisplayRec(Node head){
            if(head == null) return;
            revDisplayRec(head.next);
            System.out.print(head.val + " ");

        }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of LinkedList: ");
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node(sc.nextInt());
        Node d = new Node(sc.nextInt());
        Node e = new Node(sc.nextInt());
        Node f = new Node(sc.nextInt());

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

//        display(a);
        System.out.println("LinkedList: ");
        displayRecursively(a);
        System.out.println();
        System.out.println("Reverse LinkedList: ");
        revDisplayRec(a);
        System.out.println();
        System.out.print("Enter the idx: ");
        int idx = sc.nextInt();
        System.out.println("Element at idx "+idx+" in LinkedList is: "+get(a,idx));
    }
     public static int get(Node head, int idx){
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}

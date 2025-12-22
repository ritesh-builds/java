package CircularLinkedList;

public class CircularLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

    }
}

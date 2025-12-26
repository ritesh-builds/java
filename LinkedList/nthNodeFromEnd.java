package LinkedList;

public class nthNodeFromEnd {
    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int m = size - n + 1;
        for (int i = 1; i <= m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
        public static void deleteNthFromEnd(Node head, int n){
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }
            if(fast == null){
                head = head.next;
                return;
            }
            while(fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(13);
        Node c = new Node(17);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node temp = nthNode(a,3);
    }

}

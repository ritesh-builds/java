package LinkedList;

public class FindingMiddleElementOfLinkedList {
    // fast.next.next = null left middle. (EVEN
    // fast = null right middle.  (EVEN)
    // fast.next = null middle (ODD)
    Node middle(Node head){
       Node slow = head;
       Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

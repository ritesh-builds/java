package LinkedList;

public class removeDublicateFromSortedLinkedList {
    Node removeDuplicates(Node head){
        Node i = head;
        Node j = head;
        while (j != null){
            if(i.val == j.val) j = j.next;
            else{
                i.next = j;
                i = j;
            }
        }
        i.next = j;
        return head;
    }
}

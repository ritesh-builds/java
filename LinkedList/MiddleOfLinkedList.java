package LinkedList;

//     class Node {
//        int val;
//        Node next;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
public class MiddleOfLinkedList {
    class LinkList{

        int middle(Node head){
            Node temp = head;
            int length = 0;
            while(temp.next != null){
                length++;
                temp = temp.next;
            }
            temp = head;
            for (int i = 1; i < length/2; i++) {
                temp = temp.next;
            }

            return temp.val;
        }
    }
}

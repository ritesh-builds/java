package LinkedList;

public class IntersectionOfTwoLinkedList {

  static Node getIntersection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int size1 = 0;
        int size2 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            size1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            size2++;
        }

        temp1 = head1;
        temp2 = head2;
        if(size1 > size2){
            for (int i = 1; i <= size1-size2; i++) {
                temp1 = temp1.next;
            }

        } else if (size2 > size1) {
            for (int i = 1; i <= size2-size1; i++) {
                temp2 = temp2.next;
            }
        }
            while(temp2 != temp1){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        return temp2;
  }
}

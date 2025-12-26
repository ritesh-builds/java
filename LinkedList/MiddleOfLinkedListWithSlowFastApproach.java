package LinkedList;

public class MiddleOfLinkedListWithSlowFastApproach {
        class ll{
            int midddle(Node head){
                Node s = head;
                Node f = head;
                while(f.next != null && f != null){
                    s = s.next;
                    f = f.next.next;
                }
                return s.val;
            }
        }
}

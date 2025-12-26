package Trees;

public class TreeImpIementation {
    public static class Node { // looks like link list.
        int val;     // initial value is at 0.
        Node left;   // initially is at null.
        Node right;  // initially is at null.

        // left mein chhota and right mein bada.
        public Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" => ");
        if(root.left != null) System.out.print(root.left.val+", ");
        else System.out.print("null, ");
        if(root.right != null) System.out.print(root.right.val);
        else System.out.print("null ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
//        System.out.println(root.val);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(6);
//        Node f = new Node(7);

        b.left = e;
        b.right = null;

        display(root);
    }
}

package college.Trees;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        display(a);
        System.out.println();
        System.out.println("Number of Nodes are: "+size(a));
        System.out.println("Sum of the Nodes of a Tree is: "+sum(a));
        System.out.println("The maximum val of Node in a tree is: "+maximum(a));
        System.out.println("Levels of the Tree are: "+levels(a));
        int Height = (height(a)-1);
        System.out.println("Height of the Tree is: "+Height);

        System.out.print("Print Preorder: ");
        preorder(a);
        System.out.println();
        System.out.print("Print Inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("Print Postorder: ");
        postorder(a);
        System.out.println();
        levelOrder(a);
        System.out.println();
        KthLevel(a,0,2);
        System.out.println();
        for (int i = 0; i < levels(a); i++) {
            KthLevel(a,0,i);
            System.out.println();
        }
    }
    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }


    public static int size(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null) return 1;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left)+sum(root.right);
    }
    public static int maximum(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.left), maximum(root.right)));
    }
    public static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    public static int height(Node root){
        if(root == null) return 0;
        return (1 + Math.max(height(root.left), height(root.right)));
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
    }
    public static void KthLevel(Node root, int level, int k){
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }
}

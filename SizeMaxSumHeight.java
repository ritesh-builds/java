package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SizeMaxSumHeight {
//    static  int size;
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
//        size++;
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void InOrder(Node root){
        // inorder is left root root.
        if(root == null) return;
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }

    public static void PostOrder(Node root){
//        post order is left right root.
        if(root == null) return;
        PostOrder(root.left);
        System.out.print(root.val+" ");
        PostOrder(root.right);
    }

    public static void nthLevel(Node root,int n){
        if(root == null) return;
        if(n == 1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }

    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() >0){
            Node temp = q.peek();
            if(temp.left!= null) q.add(temp.left);
            if(temp.right!= null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int height(Node root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(-4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(100);
        b.left = e;
        b.right = null;

        System.out.println("Size is: "+size(root));
        System.out.println("Sum is: "+sum(root));
        System.out.println("Max value is: "+max(root));
        System.out.println("Height is: "+height(root));
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("Inorder: ");
        InOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        PostOrder(root);
        System.out.println();
        System.out.print("nth level: ");
        nthLevel(root,2);
        System.out.println();

        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            nthLevel(root,i);
            System.out.println();
        }
    }
}

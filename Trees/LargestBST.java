package college.Trees;
class Quad {
    int max;
    int min;
    int size;
    boolean isBST;
    Quad(int max, int min, int size, boolean isBST){
        this.max = max;
        this.min = min;
        this.size = size;
        this.isBST = isBST;
    }
}
public class LargestBST {
    public static int largestNodeBST(Node root){

    }
    static boolean flag ;
    boolean isBST(Node root){
        flag =true;
        healper(root);
        return flag;
    }
    pair healper(Node root){
        // Left se max and right se min.
        if(root == null) return new pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        pair lst = healper(root.left);
        pair rst = healper(root.right);
        int mx = Math.max(root.val, Math.max(lst.max,rst.max));
        int mn = Math.min(root.val, Math.min(lst.min,rst.min));
        if(lst.max >= root.val || rst.min <= root.val) {
            flag = false;
        }
        return new pair(mx,mn);
    }
}

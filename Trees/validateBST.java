package college.Trees;
class pair{
    int max;
    int min;
    pair(int max, int min){
        this.max = max;
        this.min = min;
    }
}

public class validateBST {
    static boolean flag ;
    boolean isBST(Node root){
        flag =true;
        maxMin(root);
        return flag;
    }
    pair maxMin(Node root){
        // Left se max and right se min.
        if(root == null) return new pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        pair lst = maxMin(root.left);
        pair rst = maxMin(root.right);
        int mx = Math.max(root.val, Math.max(lst.max,rst.max));
        int mn = Math.min(root.val, Math.min(lst.min,rst.min));
        if(lst.max >= root.val || rst.min <= root.val) {
            flag = false;
        }
        return new pair(mx,mn);
    }
}

package college.Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class MorrisTraversal {
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while (curr != null){

            if(curr.left != null){
            // find predecessor and do your work.
                Node pred = curr;
               pred =  pred.left;
               while(pred != null && pred.right != curr){
                   pred = pred.right;
               }
               if(pred.right == null){
                   pred.right = curr;
                   curr = curr.left;
               }
               else{ // pred.right == curr then, unlink and print.
                   pred.right = null;
                   System.out.print(curr.val+" ");
                   curr = curr.right;
               }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
        return ans;
    }
}

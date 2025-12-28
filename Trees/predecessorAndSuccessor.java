package college.Trees;

public class predecessorAndSuccessor {
   static void pred(Node root){
       Node pred = root;
       pred = pred.left;
       while(pred.right != null){
           pred = pred.right;
       }
   }
   static void succ(Node root){
       Node succ = root;
       succ = succ.right;
       while(succ != null){
           succ = succ.left;
       }
   }
}

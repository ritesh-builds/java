package Maps_and_Sets;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets_STL {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();
        set.add(77); set.add(65); set.add(21); set.add(2);
        set.add(11); set.add(44); set.add(3); set.add(18);
        System.out.println(set.size());

        tree.add(1); tree.add(100); tree.add(66); tree.add(78);
        tree.add(79); tree.add(45); tree.add(60); tree.add(71);

        System.out.println(set.contains(1)+" "+set.contains(21));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
        System.out.println("HasSet is considered as an Unordered set: "+set);

        System.out.println("TreeSet is considered as an Ordered set: "+tree);

        for(int ele: set){
            ele *= ele;
            System.out.print(ele+" ");
        }

    }
}

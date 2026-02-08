package Maps_and_Sets;

import java.util.HashMap;

public class Maps_STL {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Elina", 23); map.put("Riva", 25);
        map.put("Pragati", 21);    map.put("Pratiksha", 27);

        for(String key: map.keySet()){
            System.out.print(key+": "+map.get(key)+", ");
        }

        System.out.println(map.get("Riva"));
        System.out.println(map);

        System.out.println("Size of Map is: "+map.size());
        System.out.println("Map Contains key Riva: "+map.containsKey("Riva"));
        System.out.println("Map Contains value 21: "+map.containsValue(21));
        System.out.println(map.keySet());
    }
}

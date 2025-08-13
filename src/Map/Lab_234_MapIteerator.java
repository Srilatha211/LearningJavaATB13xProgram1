package Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_234_MapIteerator {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id1", 123456);
        map.put("id2", 3);
        map.put("id3",null);
        map.put(null,5);
        System.out.println(map);
        System.out.println(map.size());

        //Iterator using Key set
        for(Map.Entry<String ,Integer>  ID: map.entrySet()){
            System.out.println(ID.getKey() + "--" + ID.getValue());
        }

    }
}

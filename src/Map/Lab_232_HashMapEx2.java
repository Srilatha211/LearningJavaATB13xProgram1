package Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_232_HashMapEx2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);//Duplicate Key will override with latest one
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);//null is valid
        map.put("id5",null);//1 or more null value is allowed
        map.put(null,102);// one Null key is allowed
        map.put(null,103);//Two null keys are not allowed and will be overriden

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());//gets the key values
        System.out.println(map.values());//gets the values

        System.out.println(map.get("id3"));//gets the value of key - id3
        System.out.println(map.remove("id3"));
        System.out.println(map);


    }
}

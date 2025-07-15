package Task.July_15_Maps_Task;

import java.util.HashMap;
import java.util.Map;

public class Program4_CharacterFrequncyCounter {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        String Input = "aabbccddeeff";

        for(char c: Input.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
}

package Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_237_Frequency_OF_Characters {
    public static void main(String[] args) {

        Map<Character,Integer> freqmap = new HashMap<>();
        String Input = "Programming";

        for(char c: Input.toCharArray())
        {
            // p,r,o,g,r.....
            // p : 1
            // r : 1+1 = 2
            // o : 1
            // g : 2
            // a : 1
            // m : 2
            // i : 1
            // n : 1
            freqmap.put(c, freqmap.getOrDefault(c,0)+1);


        }
        System.out.println(freqmap);
    }
}


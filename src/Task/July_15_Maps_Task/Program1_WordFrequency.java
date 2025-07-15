package Task.July_15_Maps_Task;

import java.util.HashMap;
import java.util.Map;

public class Program1_WordFrequency
{
    public static void main(String[] args) {
        String input = "java is easy and java is powerful";

        Map<String, Integer> freqMap = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
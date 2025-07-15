package Task.July_15_Maps_Task;

import java.util.HashMap;
import java.util.Map;

public class Program8_findMostFrequentcharecterinString  {
    public static void main(String[] args) {
        String input = "aaaabbbcc";

        Map<Character, Integer> freqMap = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the character with the highest count
        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Step 3: Output the result
        System.out.println("Most frequent character: " + mostFrequentChar + " (Count: " + maxCount + ")");
    }
}


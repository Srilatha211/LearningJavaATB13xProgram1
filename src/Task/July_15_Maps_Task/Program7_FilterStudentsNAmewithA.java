package Task.July_15_Maps_Task;

import java.util.HashMap;
import java.util.Map;

public class Program7_FilterStudentsNAmewithA {
    public static void main(String[] args) {
        Map<Integer,String> hs= new HashMap<>();
        hs.put(101, "Anjali");
        hs.put(102, "Dipak");
        hs.put(103, "Aman");
        hs.put(104,"Ravi");

        for (Map.Entry<Integer,String> entry : hs.entrySet()) {
            if (entry.getValue().startsWith("A")) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }

    }
}

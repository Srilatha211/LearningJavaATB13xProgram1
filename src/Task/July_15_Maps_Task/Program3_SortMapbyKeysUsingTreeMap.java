package Task.July_15_Maps_Task;

import java.util.Map;
import java.util.TreeMap;

public class Program3_SortMapbyKeysUsingTreeMap {
    public static void main(String[] args) {
        Map TM = new TreeMap();
        TM.put("Ravi" , 80);
        TM.put("Anjali" , 95);
        TM.put("Dipak" , 75);
        TM.put("dipak" , 75);//this will be printed based on ASCII values order first caps then smalls
        System.out.println(TM);
    }
}

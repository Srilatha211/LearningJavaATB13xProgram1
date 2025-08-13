package Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_231_HashMapEX {
    public static void main(String[] args) {
        //Here always the Key will be String and value will be Interger
        //If we interchange and try to add it will be an error
        Map<String, Integer> vehicles = new HashMap();
        vehicles.put("MG Astor", 1);
        vehicles.put("i10", 2);
        vehicles.put("Honda ACTIVA", 1);
        vehicles.put("BMW", 2);
        vehicles.put("TESLA", 5);
        vehicles.put("TESLA", 10);
        //If we have duplicate keys - Here it will override with latest one
//        vehicles.put(234,"dasda");//If we interchange and try to add it will be an error
        System.out.println("Total Vehicles : " + vehicles.size());
        //here size means the keys not the values - keys are 5

// Iterator over the Map

        for(String key : vehicles.keySet()){
            System.out.println(key + " -> "+vehicles.get(key));
        }
        //Key set will give all the key values

// Checking if key exists
        //match is casesentive
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // Clearing the map
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());



    }
}
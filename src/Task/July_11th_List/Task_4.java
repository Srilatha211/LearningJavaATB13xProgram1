package Task.July_11th_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
//Description:
//Create an ArrayList of cities: Mumbai, Delhi, Pune.
//Check if Pune is present in the list.
// Print a message accordingly.
// (you can use If Condition to check the Pune city and you can take the City name from User)
public class Task_4
{
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name:");
        String inputCity = sc.nextLine();

        // Case-sensitive check for "Pune"
        if (inputCity.equals("Pune") || inputCity.equals("pune")) {

                System.out.println("Pune is present in the list.");
            } else {
                System.out.println("Pune is not present in the list.");
            }


    }
}
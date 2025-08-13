package Ex_28_Enum;

public class Lab_179_Enum {

public static void main(String[] args) {
    System.out.println(Day.FRIDAY);
    System.out.println(PROJECT_NAMES.google);
}
//enums always try to keep the values which are constants


enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_NAMES{
    google, restassured, katalon, vwo
}}


//Here we don't need to have a calss if you want to store the fixed values
//The below one is not a good practise
//If we create as below we need an array and store them

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}



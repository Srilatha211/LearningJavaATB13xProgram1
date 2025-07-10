package Ex_18_OOPS_Constructor;

public class Lab151_DC_Vs_PC {
    public static void main(String[] args) {
        BabyA A= new BabyA();
        BabyA B= new BabyA();

        // Default construcot calling
        // here in DC constructor
        System.out.println(A.name);
        System.out.println(B.name);
        // here in Default Constructor every baby name will be same
        // that not the real case
        //so, for that we use parameterized constructor

        // During object creation we can set the vlaue of/ give the person values to the variables
        // baby born i will give the name so we use PC

BabyA c= new BabyA("Yashu", 12344, 2024, 1, 1) ;
        BabyA d= new BabyA("sri", 12344, 2024, 1, 1) ;
        System.out.println(c.name);
        System.out.println(c.Year);
        System.out.println(d.name);


    }

}


class BabyA
{
    String name;
    int Adhar;
    int Year;
    int Month;
    int date;

    //Default constructor
BabyA(){
//here we have not given ur personal values
    name = "Harsha";
    Adhar= 123456789;
    Year= 2024;
    Month= 1;
    date = 4;


}
// here in Default Constructor every baby name will be same
    // that not the real case
    //so, for that we use parameterized constructor
//Parameterized Constructor

    BabyA(String User_name, int User_Adhar, int User_Year, int User_Month, int User_day){
// here we can give the personal values
this.name= User_name;
    this.Adhar= User_Adhar;
    this.Year = User_Year;
    this.Month= User_Month;
    this.date= User_day;
    }

}
package July_7th_Abstractaction;

public class Lab166_Abstraction_Real {
    public static void main(String[] args) {
        company c1= new company();
        c1.computepay();
        double d1=  c1.computepay();
        System.out.println("Computed Pay: " + d1);


    }
}


abstract class Employee{

    private String name;
    private int Id;
    private long Phoneno;

    Employee(){
        System.out.println("this is a DC");
    }

    Employee(String User_name, int User_ID, long User_Phoneno){
       this.name= User_name;
       this.Id = User_ID;
       this.Phoneno = User_Phoneno;
        System.out.println("Constructor of Company");
    }

    abstract double computepay();

}

class company extends Employee{
    @Override
    double computepay() {
        return 1000;

    }


}
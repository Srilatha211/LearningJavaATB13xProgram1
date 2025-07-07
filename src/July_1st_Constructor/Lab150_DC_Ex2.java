package July_1st_Constructor;

public class Lab150_DC_Ex2 {
    public static void main(String[] args) {
        car c1= new car();
        c1.name= "This another way to define car name and use below";
        c1.model= "This another way to define model name and use below";
        c1.year= 3456;



        System.out.println(c1.name);// we can mention car name in this way also
        System.out.println(c1.model);
        System.out.println(c1.year);

    }

}

class car{
    String name;
    String model;
    int year;
//This is Default creation
    car(){
        System.out.println(name = "Benz");
        System.out.println(model = "Benz model");
        System.out.println(year= 1997);// we can mention car name in this way also
        name= "Audi";
        model= "xxxx";
        year = 1234;
    }


}
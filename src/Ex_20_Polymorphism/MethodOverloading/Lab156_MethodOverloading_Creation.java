package Ex_20_Polymorphism.MethodOverloading;

public class Lab156_MethodOverloading_Creation {
    public static void main(String[] args) {
        MathOperation M1= new MathOperation();
       int r1=  M1.add(10,30);
       int r2= M1.add(20,40,50);
       double r3= M1.add(2000,3000);
       String s= M1.add("Sri", "latha");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s);

//Here in complie time only we are deciding that which method we are using based on parameter



    }
}

class MathOperation{

    int add(int a ,int b){
return a+b;
    }
    int add(int a ,int b, int c){
        return a+b+c;
    }
double add(double a, double b){

        return a+b;

}
    String add(String a, String b){

        return a+b;

    }

}
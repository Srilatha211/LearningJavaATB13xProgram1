package July_3rd_Polymorphism_MethodOverloading;

public class Lab157_Real_Mo {
    public static void main(String[] args) {
        Home H1= new Home();
        H1.Task();
       int r1 =  H1.Task(30);
        System.out.println(r1);
        boolean r2= H1.Task(false);
        System.out.println(r2);

    }
}

class Home{

    void Task(){
        System.out.println("Home");
    }


    int Task(int a){
        return a;
    }

   boolean Task(boolean a){
        return false;

   }

}


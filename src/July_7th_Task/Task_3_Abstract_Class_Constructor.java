package July_7th_Task;

public class Task_3_Abstract_Class_Constructor {
    public static void main(String[] args) {
        method m1= new method();// Constructor of abstract class runs
        m1.display();              // Calls method CM() from abstract class
    }

}


abstract class Constructor{
    Constructor(){
        System.out.println("This is a constructor in abstract class");
    }
    void CM(){
        System.out.println("This is a method in abstract class");
    }


}

class method extends Constructor{
    void display(){
        CM();
    }
}

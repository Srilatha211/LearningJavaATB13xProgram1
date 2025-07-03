package July_3th_Method_Overriding;

public class MethodOverriding_Employee_Info {
    public static void main(String[] args) {

        Employee emp= new Employee();
        emp.role();
        Manager manager = new Manager();
        manager.role();
        clerk clerk= new clerk();
        manager.role();
        Tester tester= new Tester();
        tester.role();

    }
}
class Employee{

    void role(){
        System.out.println("This is an default employee");
    }
}
class Manager extends Employee{
    @Override
    void role(){
        System.out.println("This is Manager role");
    }
}

class clerk extends Employee{

    @Override
    void role(){
        System.out.println("This is clerk role");
    }
}

class Tester extends Employee{

    @Override
    void role(){
        System.out.println("This is Tester role");
    }
}


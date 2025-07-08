package July_7th_Interfaces;

public class Lab167_Interfaces {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}
//Interface means we have always incomplete methods
//for Interfaces we need to mention as Interface not the calss
// Interfaces uses Key word Implements

interface Father1{
    void money();
}
interface Father2{
    void money();
}

class Child implements Father1,Father2{


    @Override
    public void money() {
        System.out.println("July_7th_Interfaces.Child own Money!");
    }
}


package Ex_19_OOPs_Inheritance.Single_Inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        TestCase1 t1= new TestCase1();
        t1.runningt1();

        Testcase2 t2= new Testcase2();
        t2.runningt2();

        Common_to_all c1= new Testcase3();
        // Dynamic Dispatch - Child is born when father is present
        // only using Extends keyword is possible

    }
}

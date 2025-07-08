package July_4th_Task;

public class Task_3_Variable_Using_Super {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.name);  // accessing inherited variable directly
        s.m1();// calling overridden method

    }
}

class college {
    String name = "Sri";

    void m1() {
        System.out.println("This is the variable method");
    }
}

class student extends college {
    @Override
    void m1() {

        System.out.println(super.name);  // accessing parent class variable using super
    }
}
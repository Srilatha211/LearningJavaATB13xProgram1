package July_4th_Task;

public class Task_1_Constructor_Using_Super {
    public static void main(String[] args) {
        Person1 P1 = new Person1();

    }

}


class Person {

    Person() {
        System.out.println("This is a cinstructor_Using_super");
    }

}

class Person1 extends Person {
    Person1() {
        super();
    }
}
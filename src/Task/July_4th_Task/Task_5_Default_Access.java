package Task.July_4th_Task;

public class Task_5_Default_Access {
    // Class in the same file/package
        public static void main(String[] args) {
            Student1 s = new Student1();//Object creation
            s.showDetails();// calling default method
        }
}

// Class with default access and method with default access
class Student1 {
    void showDetails() {// default access
        System.out.println("Student details are displayed.");
    }
}
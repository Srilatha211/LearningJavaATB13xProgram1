package Task.July_4th_Task;


/*
Understand how public methods are accessible from anywhere.

📝 Instructions:

Create a class Student with a public method showInfo()
that prints "Public Access: Student Info".
In the main() method, create an object of Student.
Call showInfo() directly from anywhere
like same class, sub class, different class same package,
in different package it should work without restriction.
*/

public class Task_7_Public {
    public static void main(String[] args) {
        Student3 s = new Student3();


        s.showInfo();
    }
}
class Student3 {

    public void showInfo() {
        System.out.println("Public Access: Student Info");
    }
}


package Ex_32_Collection_FrameWorks_DSA.List;

import java.util.ArrayList;

public class Lab_219_AL_Student {
    public static void main(String[] args) {

        Student S1= new Student("sri", "3467");
        Student S2= new Student("latha", "3467");
        ArrayList list = new ArrayList();
        list.add(S1);
        list.add(S2);
        System.out.println(list);//using tostring object
        // by using print method
       S1.printDetails();
        S2.printDetails();

    }
}

class Student{

    private String name;
    private String rollno;

    Student(String Username, String roll_no){
        this.name= Username;
        this.rollno= roll_no;

    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
//this is normal of printing the data
    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollno);
    }
//here if we want to print the data we can use this tostring object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
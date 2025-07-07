package July_7th_Task;

public class Task_5_Interfaces_MultipleInheritance {
    public static void main(String[] args) {
        Document D1= new Document();
        D1.print();
        D1.show();
    }
}

interface Printable{
    void print();
}

interface showable{
    void show();
}

class Document implements Printable,showable {

    @Override
    public void print() {
        System.out.println("This is Printing a Document");
    }

    @Override
    public void show() {
        System.out.println("This is Showing a Document");
    }
}
package July_1st_Constructor;

public class Lab147_CatConstructot {
    public static void main(String[] args) {
        Cat c= new Cat();//1st
       c.running();
        new Cat(); //2nd- her 2 object are created
        new Cat().running();
//c- is an object reference
        // new cat()- is an object
      //  c1.running()-- This will not run bcz c1 object is not created
        // if we don't have object their is no behaviour
        //Cat c1-- This is the object reference

    }

}

class Cat{
// this the method creation
    void running(){
        System.out.println("Running");
    }
}
package July_2nd_Inheritance;

public class Lab154_Inheritance_Creation {
    public static void main(String[] args) {
        Father father= new Father();
        father.gold();
        System.out.println(father.bhk2);

        Son son= new Son();
        System.out.println(son.bike);
        son.gold();
    }

}

class Father{
    int gold= 100;
    int bhk2=1;

    void gold()
    {
        System.out.println("This is father's gold");
    }
}
// as soon as we extend the father class
// it means son can access all the things from father class
class Son extends Father{
    int bike=1;

}
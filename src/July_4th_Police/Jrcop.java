package July_4th_Police;

public class Jrcop {
    public static void main(String[] args) {
        Cop Jrcop= new Cop(50);
        Jrcop.canIshoot();
Jrcop.Default();
// within package default and protected will work

        //Calrification- We can have any reference object we used Jrcop
        Cop c2= new Cop(50);
        c2.canIshoot();
    }


}

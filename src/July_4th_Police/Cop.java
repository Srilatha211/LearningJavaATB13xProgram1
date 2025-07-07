package July_4th_Police;

public class Cop {
   public  int gun;
    String ID;

    //Parameterised Constructor
public Cop (int bullet) {

    this.gun = bullet;
}
    //Method |Behaviour
     void canIshoot(){
//If we make this public even thief can also shoot but that not the real case
        System.out.println("You can shoot");
    }
    void Default(){
        System.out.println("this is default access");
    }
}





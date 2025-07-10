package Ex_22_Access_Modofiers.Criminal;

import Ex_22_Access_Modofiers.Police.Cop;

public class thief {
    public static void main(String[] args) {
        Cop thief= new Cop(100);
        thief.gun=100;
       // thief..Default();-- cant acces bcz its default only within the pacakage
        //Calrification- We can have any reference object we used thief
       // thief.canIshoot();// now this is in public --
        // So,thief should not be able to shoot we make it private/default in cop class
        // when we make this private,default this will not accesible ,
        // but what if we have other cop he should be able to shoot
        //so,for that we need to make it as protected
        //Protected which will be accesible within in same pacakage

    }
}

package July_2nd_Multilevel_Inheritance;



public class Lab155_MultiLevel {
    public static void main(String[] args) {
        System.out.println("This is Grand Father");

        GrandFather GF= new GrandFather();
        GF.home();
        System.out.println(GF.gold);

        System.out.println("This is Father");
        Father F= new Father();
        System.out.println(F.gold);
        System.out.println(F.bike);
        System.out.println(F.gold_1);


        System.out.println("This is Son");

        son s= new son();
        s.home();
        s.home();
        System.out.println(s.bike);
        System.out.println(s.gold);
        System.out.println(s.gold_1);
    }

}

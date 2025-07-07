package July_4th_Access_Modofiers;

public class Access_Modifier {
    public static void main(String[] args) {
        son s= new son();
        System.out.println(s.bhk3 + " : bhk3");
        System.out.println(s.bike + " : bike");


    }
}
class Father{
    private int gold =100;
    int bike=1;
    public int bhk3=1;
}

class son extends Father{

    void wecanuse(){
        System.out.println(bike);//bcz its default can be used within same package
        System.out.println(bhk3);// its public can use any where
       // System.out.println(gold);// can't access bcz its private

    }
}
package July_2nd_Multilevel_Inheritance;

public class Lab156_MultiLevel_DynamicDispatch {
    public static void main(String[] args) {

        son s1= new son();// normal object creation
//son s2= new Father();//This is not possble father born using child reference

        GrandFather gf= new son();
        //Dynamic dispatch-- when we create this the object functions will be called
        gf.home();

        GrandFather gf1= new Father();
        //Dynamic dispatch-- when we create this the object functions will be called
        // If father has no home then 1 level above one will be displayed which means "GF-home"
        gf1.home();

        Father f1= new son();
        f1.home();
    }
}

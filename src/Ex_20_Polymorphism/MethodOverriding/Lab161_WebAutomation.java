package Ex_20_Polymorphism.MethodOverriding;

public class Lab161_WebAutomation {
    public static void main(String[] args) {
        ChromeBrowser C1= new ChromeBrowser();
        C1.OpenBrowser();

        FireFoxBrowser F1= new FireFoxBrowser();
        F1.OpenBrowser();
        CommonToAll c3 = new CommonToAll();
        c3.OpenBrowser();

        //Dynmaic dispatch

        CommonToAll C2= new ChromeBrowser();
        C2.OpenBrowser();

        CommonToAll c4= new FireFoxBrowser();
        c4.OpenBrowser();

       //  FireFoxBrowser f2 = new CommonToAll();
        // this will not work bcz child cant work will base class object
    }
}


class CommonToAll{
    void OpenBrowser(){
        System.out.println("Starting IE Browser!");

    }

}
class ChromeBrowser extends CommonToAll{
    @Override
    void OpenBrowser(){

        System.out.println("Starting ChromeBrowser!");

    }

}
class FireFoxBrowser extends CommonToAll{
    @Override
    void OpenBrowser(){

        System.out.println("Starting FireFoxBrowser!");

    }

}


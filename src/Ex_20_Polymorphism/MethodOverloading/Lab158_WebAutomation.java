package Ex_20_Polymorphism.MethodOverloading;

public class Lab158_WebAutomation {
    public static void main(String[] args) {
        Browser B1= new Browser();
        B1.Browser();
        B1.Browser("chrome");
    }
}


class Browser{

    void Browser(){
        System.out.println("This is default browser");
    }

    String Browser(String browser){
        System.out.println("Start browser : " + browser);
        return browser;
    }
}
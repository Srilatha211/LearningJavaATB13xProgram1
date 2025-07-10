package Ex_9_Switch_Case;

import java.util.Scanner;

public class Lab0062_Switch_String_caseSensitive {
    public static void main(String[] args) {
        System.out.println("enter the browser name");
        Scanner scanner= new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch(browser){
            case "chrome":
                System.out.println("this is a chrome browser");
                break;
            case "firefox":
                System.out.println("this is a firefox browser");
                break;
            default:
                System.out.println("Not a Browser");
                break;




        }
    }
}

package June_16_Switch_Case;

import java.util.Scanner;

public class Lab0061_Switch_Browser_Ex {
    public static void main(String[] args)
    {
        System.out.println("enter the browser name");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Open the chrome browse");
            break;
            case "Firefox":
            System.out.println("Open the Firefox browse");
            break;
            case "Edge":
            System.out.println("Open the Edge browse");
            break;
            default:
                System.out.println("Not a browser");
                break;




        }
    }

}

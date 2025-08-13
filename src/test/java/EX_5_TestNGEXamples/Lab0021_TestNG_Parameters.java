package EX_5_TestNGEXamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab0021_TestNG_Parameters {

    //Here we can run the test by passing the parameters in testng file
    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome!");
        }
        if(value.equalsIgnoreCase("safari")){
            System.out.println("We can't run on Safari");
        }

    }
}

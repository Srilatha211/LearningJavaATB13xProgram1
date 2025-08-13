package EX_5_TestNGEXamples;

import org.testng.annotations.Test;

public class Lab0024_TestNG_InvocationCOunt {
//How many times u want to run
    //Real Scenario: When u want to make 5 logins or registrations
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }
}
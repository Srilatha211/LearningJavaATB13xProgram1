package EX_5_TestNGEXamples;

import org.testng.annotations.Test;

public class Lab0025_TestNG_SOFT_Vs_Hard_Dependency  {

    @Test
    public void login() { /* might fail */ }

    @Test(dependsOnMethods = "login")         // Hard dependency
    public void placeOrder() { /* runs only if login passed */ }

    @Test(dependsOnMethods = "login",         // Soft dependency
            alwaysRun = true)
    public void closeBrowser() { /* runs even if login failed */ }
}

package EX_5_TestNGEXamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab0023_TestNG_AlwaysRun{

    //If we mention always run then it runs always
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}

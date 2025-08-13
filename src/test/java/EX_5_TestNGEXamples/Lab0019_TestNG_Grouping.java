package EX_5_TestNGEXamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab0019_TestNG_Grouping {
// reg -> all the 3 testcase
    // sanity -> sanity run = 1
    // smoke -> smoke run = 1
    //Here if we want to run this gruping
// then need to go to testng.xml file and add grouping etc.,,
    //after that we need to agg grouping in functions
    //(groups = {"reg","sanity"})
@Test(groups = {"reg","sanity"})
    public void test_sanity_run(){
        System.out.println("Sanity");
        Assert.assertTrue(true);

    }
    @Test(groups = {"reg","smoke"})
    public void test_reg_smoke(){
        System.out.println("Smoke");
        Assert.assertTrue(true);

    }
    @Test(groups = {"reg"})

    public void test_reg_run(){
        System.out.println("Reg");
        Assert.assertTrue(true);

    }
}

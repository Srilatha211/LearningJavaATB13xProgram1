package EX_5_TestNGEXamples;

import org.testng.annotations.Test;

public class Lab0018_TestNG_Priority_2 {
    //here the o/p will be 1,2,3,4 based on priority
    @Test(priority = 1)
    public void test_t1() {
        System.out.println("1");
    }
    @Test(priority = 3)
    public void test_t2() {
        System.out.println("3");
    }
    @Test(priority = 2)
    public void test_t3() {
        System.out.println("2");
    }
    @Test(priority = 4)
    public void test_t4() {
        System.out.println("4");
    }
}


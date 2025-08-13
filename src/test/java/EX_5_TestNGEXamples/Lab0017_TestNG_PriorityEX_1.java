package EX_5_TestNGEXamples;

import org.testng.annotations.Test;

public class Lab0017_TestNG_PriorityEX_1 {

    //Here the o/p will be based on the ordering so first it will execute the
    //t1,t2,t3,t4 methods -- o/p -- is 1,3,2,4

    //So, if we want to execute the o/p as 1,2,3,4 then need to set the priority
    //then will execute based on priorities given to the functions
    //in next example set the priorities and check
@Test
    public void test_t1() {
        System.out.println("1");
    }
    @Test
    public void test_t2() {
        System.out.println("3");
    }
    @Test
    public void test_t3() {
        System.out.println("2");
    }
    @Test
    public void test_t4() {
        System.out.println("4");
    }
}

package EX_5_TestNGEXamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab0022_TestNG_enabled {

    //Enabled is always true, bcz it always runs
        @Test
        public void test01() {
            Assert.assertTrue(true);
        }
        @Test(enabled = false)
        public void test02() {
            Assert.assertTrue(true);
        }
        @Test
        public void test03() {
            Assert.assertTrue(true);
        }
    }


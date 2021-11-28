package classwork;

import org.junit.Test;

class MainForTestTest {

    @Test
    void testDrive1() {
        MainTest.divide(1,1);
    }
    @Test
    void testDrive2() {
        MainTest.divide(1,2);
    }
    @Test
 //   @Disabled
    void testDrive3() {
        MainTest.divide(1,0);
    }

}
package Testpackage;

import algorithm_assignment_4.Coupon;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    @Test public void testAdd1(){
        final Coupon c = new Coupon(100);
        c.add(c.result, 100, 100);
        c.add(c.result, 32, 100);
        c.add(c.result, 1024, 100);

        assertEquals(2, c.getNum(28));
        assertEquals(1,c.getNum(8));
        assertEquals(0,c.getNum(0));

    }
}

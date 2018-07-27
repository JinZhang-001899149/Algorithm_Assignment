package Testpackage;

import algorithm_assignment_4.HashMethod;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMethodTest {
    @Test public void testHashMethod1(){
        final HashMethod hm = new HashMethod();
        assertEquals(80, hm.hash(15.0, 100));
    }

    @Test public void testHashMethod2(){
        final HashMethod hm = new HashMethod();
        assertEquals(20, hm.hash(10.0, 100));
    }

    @Test public void testHashMethod3(){
        final HashMethod hm = new HashMethod();
        assertEquals(0, hm.hash(0, 100));
    }

    @Test public void testHashMethod4(){
        final HashMethod hm = new HashMethod();
        assertEquals(28, hm.hash(100, 100));
    }

    @Test public void testHashMethod5(){
        final HashMethod hm = new HashMethod();
        assertEquals(28, hm.hash(32, 100));
    }
}

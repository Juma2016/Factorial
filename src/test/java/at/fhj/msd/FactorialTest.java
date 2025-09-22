package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testAvalidFindFactorial() {
        assertEquals(1,Factorial.findFactorial(0));
        assertEquals(1, Factorial.findFactorial(1));
        assertEquals(2, Factorial.findFactorial(2));
        assertEquals(6,Factorial.findFactorial(3));
        assertEquals(24, Factorial.findFactorial(4));
        assertEquals(120, Factorial.findFactorial(5));
        assertEquals(-1, Factorial.findFactorial(-5));
    }

   
}

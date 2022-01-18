package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testGetGreatestCommonDivisor() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(6, mathAlgorithms.getGreatestCommonDivisor(6, 54));
        assertEquals(1, mathAlgorithms.getGreatestCommonDivisor(11, 48));
    }

    @Test
    void testGetGreatestCommonDivisorWithInvalidNumber() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> mathAlgorithms.getGreatestCommonDivisor(0, 18));
        assertEquals("Invalid number", iae.getMessage());
    }
}
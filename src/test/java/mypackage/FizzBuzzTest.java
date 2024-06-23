package mypackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(90));
    }
}
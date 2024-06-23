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
    @Test
    void fizz() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz",FizzBuzz.fizzBuzz(12));
    }
    @Test
    void buzz() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz",FizzBuzz.fizzBuzz(20));
    }
    @Test
    void number() {
        assertEquals("1",FizzBuzz.fizzBuzz(1));
        assertEquals("4",FizzBuzz.fizzBuzz(4));
        assertEquals("17",FizzBuzz.fizzBuzz(17));
    }
}
package mypackage;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        return null;
    }
}
package Tasks.Loop;

public class test4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
/*
Question: Write a Java program that prints the numbers from 1 to 100, but for multiples of 3,
 it prints "Fizz" instead of the number, and for multiples of 5, it prints "Buzz".
 For numbers that are multiples of both 3 and 5, it should print "FizzBuzz".

go
Co
 */

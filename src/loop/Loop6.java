package loop;

public class Loop6 {
    public static void main(String[] args) {

        int n = 10;
        int fac = 1;
        for (int i = 1; i <=n ; i++) {
            fac *= i;

        }
        System.out.println(fac);
    }
}
/*
Question: Write a Java program that calculates the factorial of a number n
(the product of all positive integers less than or equal to n).
 The program should take an input n from the user and print the result.
 */
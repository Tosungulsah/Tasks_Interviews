package ForLoop;

public class Factorial {
    public static void main(String[] args) {
        //kullanıcının verdiği sayının faktoryelini bulalım
        //5!= 5*4*3*2*1

        int num= 5;
        int faktoryel=1;

        for (int i = num; i >=1; i--) {
            faktoryel=faktoryel*i;

        }

        System.out.print(faktoryel);
    }
}
/*
 Write a Java program that calculates the factorial of a number n (the product of all positive
  integers less than or equal to n). The program should take an input n from the user and print the result.
 */
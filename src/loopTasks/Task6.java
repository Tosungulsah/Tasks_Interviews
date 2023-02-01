package loopTasks;

public class Task6 {
    /*
    Question: Write a Java program that calculates the factorial of a
    number n (the product of all positive integers less than or equal to n).
    The program should take an input n from the user and print the result.
     */
    public static void main(String[] args) {
        int n= 5;
        int count=1;
        for (int i = 1; i <= n; i++) {
            count *=i;

        }
        System.out.println(count);

    }
}

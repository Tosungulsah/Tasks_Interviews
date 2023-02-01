package loopTasks;

public class Task5 {
    /*
    Question: Write a Java program that prints the numbers from 1 to 100,
    but for multiples of 3, it prints "Fizz" instead of the number,
    and for multiples of 5, it prints "Buzz". For numbers that are multiples
    of both 3 and 5, it should print "FizzBuzz".

     */
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i%15==0){
                System.out.println(i+ " = FizzBuzz");
            } else if (i%5==0) {
                System.out.println(i+ " = Buzz");
            }else if (i%3==0){
                System.out.println(i+ " = Fizz");
            }else {
                System.out.println(i);
            }
        }

    }
}

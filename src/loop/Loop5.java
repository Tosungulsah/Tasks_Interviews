package loop;

public class Loop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 101; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz   ");
            } else if (i% 5 == 0){
                System.out.println("Buzz  ");
            }else if (i% 3 == 0) {
                System.out.println("Fizz  ");

            }else {
                System.out.println(i);
            }
        }

    }
}
/*
Question: Write a Java program that prints the numbers from 1 to 100,
 but for multiples of 3, it prints "Fizz" instead of the number,
 and for multiples of 5, it prints "Buzz".
 For numbers that are multiples of both 3 and 5, it should print "FizzBuzz".

 */
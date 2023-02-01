package loopTasks;

public class Task3 {
    //Printing even numbers between 1 and 10:
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
        for (int i = 0; i < 51; i+=2) {
            System.out.println(i);
        }
    }
}

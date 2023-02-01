package ForLoop;

public class Vowels {
    public static void main(String[] args) {
        //Counting the number of vowels in a string:
        String str="Women power";

        int count=0;

        for (int i = 0; i < str.length()-1; i++) {
             char c=str.charAt(i);
             if(c=='a' || c=='e' || c=='o'|| c=='u' || c=='i'){
                 count ++;

             }

        }

        System.out.println(count);
    }
}

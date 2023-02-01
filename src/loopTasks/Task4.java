package loopTasks;

public class Task4 {
    //Counting the number of vowels(sesli harf) in a string:
    public static void main(String[] args) {

        String name= "Suheda";
        int vowel=0;
        for (int i = 0; i < name.length(); i++) {
            char c= name.charAt(i);
            if (c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
                vowel ++;
            }
        }
        System.out.println(vowel);
    }
}

package For_Loops;

public class Vowels {
    public static void main(String[] args) {
        String str= "Women Power";

        int vowel=0 ;
        for (int i = 0; i < str.length(); i++) {
            char c= str.charAt(i);
            if(c=='a' ||  c=='e' ||c=='i' ||c=='o' ||c=='u' ){
                vowel++;
            }
        }
        System.out.println(vowel);
    }
}

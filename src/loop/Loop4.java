package loop;

public class Loop4 {
    public static void main(String[] args) {
        String str = "womenPower";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c =='a' || c == 'u' || c =='e' || c =='i' || c =='o' ){
                count ++;

            }
        }
        System.out.println(count);
    }
}
/*
Counting the number of vowels in a string
 */
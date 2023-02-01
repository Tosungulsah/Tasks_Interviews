package ForLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class StringLoop {
    public static void main(String[] args) {


        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("akile", "seyma", "suheda", "gulsah"));

        for (String name : names) {
            System.out.println(name);
        }

    }
}

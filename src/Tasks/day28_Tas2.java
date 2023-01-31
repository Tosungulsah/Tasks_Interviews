package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class day28_Tas2 {
    public static void main(String[] args) {
        /*
        2. write a program that can swap the first and last elements of an
integer arraylist
         */
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(2,5,4,7,8,9,4,5));

        System.out.println(numbers);
     //   ArrayList<Integer> numbers2= new ArrayList<>(Arrays.asList());



        Collections.swap(numbers, 0, numbers.size()-1 );


        System.out.println( numbers);
    }
}

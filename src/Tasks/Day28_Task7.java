package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Day28_Task7 {
    /*
    Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
    */
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));

        int firstDublicated = 0;

        for (Integer each : numbers) {
            if(numbers.indexOf(each) !=numbers.lastIndexOf(each)){
                firstDublicated = each;
                break;
            }
        }
        System.out.println(firstDublicated);
 /* ArrayList<Integer> result = new ArrayList<>(); //{10, 20}

        for (Integer each : numbers) {
            if(result.contains(each)){
                continue;
            }

            result.add(each);
        }
        System.out.println(result);

        */
    }
}

package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day28_Task3 {
    public static void main(String[] args) {
       List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4));
        System.out.println(numbers);


        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2 != 0){
                numbers.set(i, numbers.get(i)*2);

            }
        }

        }
        }



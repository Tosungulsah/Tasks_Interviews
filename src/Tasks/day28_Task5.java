package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class day28_Task5 {
    public static void main(String[] args) {

            ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
            Set<Integer> set=new HashSet<>();
            for (int number:numbers){
                if (!set.add(number)){
                    System.out.println(number);
                    break;
                }
            }




        }
    }


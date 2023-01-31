package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Day28_Task4_ArraylistMerge {
    public static void main(String[] args) {
        String[] arr1 = {"A","B","C","D"};
        String[] arr2= {"E","F","G","g"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);
      }

}

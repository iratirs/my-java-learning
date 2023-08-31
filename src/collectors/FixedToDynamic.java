package collectors;

import java.util.ArrayList;
import java.util.Arrays;

public class FixedToDynamic {

    public static void main(String[] args){

        //fixed list
        String [] fixedList = {"a","b","c"};

        //arraylist
        ArrayList<String> dynamicArray = new ArrayList<>();
        dynamicArray.add("first");
        dynamicArray.add("second");

        //add fixed list to arraylist
        dynamicArray.addAll(Arrays.asList(fixedList));

        for(String e : dynamicArray){
            System.out.println(e);
        }
    }
}

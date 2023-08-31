package collectors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

    public static void main(String[] args){

        Set<String> namesHS = new HashSet<>();
        namesHS.add("Govind");
        namesHS.add("Irati");
        namesHS.add("Nicky");
        namesHS.add("Santosh");
        namesHS.add("Irati");

        //print using iterator to loop
        Iterator<String> itVal = namesHS.iterator();
        while(itVal.hasNext()){
            System.out.println(itVal.next()); //no repeated values
        }
    }
}
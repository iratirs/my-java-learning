package collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args){

        Map<String, String> myMap = new LinkedHashMap<>();

        myMap.put("Team1", "Irati");
        myMap.put("Team2", "Nicky");
        myMap.put("Team3", "Govind");
        myMap.put("Team4", "Irati");

        //print keys
        System.out.println("All keys:");
        for(String key : myMap.keySet()){
            System.out.println(key);
        }

        //print values
        System.out.println("\nAll values:");
        for(String val : myMap.values()){
            System.out.println(val);
        }

        //print key and value
        System.out.println("\nKey - value:");
        Set<String> values = myMap.keySet();
        for(String key : values){
            System.out.println(key + " - " + myMap.get(key));
        }

        //print value of a given key
        System.out.println("\nThe value of key 'Team3' is:");
        System.out.println(myMap.get("Team3"));
    }
}

package collectors;

import java.util.ArrayList;

public class MyArrayList {

    public static void main(String[] args){

        //built-in array
        String[] org = {"LBG", "BOS", "SW", "Halifax", "LBG"};

        //ArrayList
        ArrayList<String> namesArLst = new ArrayList<>();
        namesArLst.add("Govind");
        namesArLst.add("Irati");
        namesArLst.add("Nicky");
        namesArLst.add("Santosh");
        namesArLst.add("Irati");

        //print ArrayList combined with org using while loop
        int i = 0;
        if(org.length == namesArLst.size()){ //make sure same size
            while(i < namesArLst.size()){
                System.out.println(namesArLst.get(i) + " : " + org[i]);
                i++;
            }
        }

        System.out.println("\n");

        //print ArrayList combined with org backwards using for loop
        if(org.length == namesArLst.size()) { //make sure same size
            for (int j = namesArLst.size(); j > 0 ; j--) {
                System.out.println(namesArLst.get(j-1) + " : " + org[j-1]);
            }
        }
    }
}

package exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InteractiveMethods {

    public static String userInputReader(){
        Scanner read = new Scanner(System.in);
        String userInput = read.nextLine();
        return userInput;
    }

    public static String userDefinedLstYN(){
        System.out.println("Do you want to input your own list? (Y/N)");
        String userInput = userInputReader();
        return userInput;
    }

    public static String handleAllExceptionsYN() {
        System.out.println("Do you want to handle all exceptions? (Y/N)");
        String userInput = userInputReader();
        return userInput;
    }

    public static Boolean booleanTranslate(String method){

        Boolean b;

        if(method.equalsIgnoreCase("y") |
                method.equalsIgnoreCase("yes")){

            b = true;

        } else if(method.equalsIgnoreCase("n") |
                method.equalsIgnoreCase("no")){

            b = false;

        } else {

            System.out.println("'" + method + "' is not a valid option");
            b = false;
        }

        return b;
    }

    public static ArrayList<String> defaultList(){
        ArrayList<String> defaultAr = new ArrayList<>();
        defaultAr.add(null);
        defaultAr.add("3");
        defaultAr.add("a");
        return defaultAr;
    }

    public static ArrayList<String> arrayConditional(){

        Boolean userDefinedLstYN = booleanTranslate(userDefinedLstYN());

        if(userDefinedLstYN == true){

            System.out.println("Let's input the elements of our list!");
            ArrayList<String> ar = arrayBuilder();

            if(ar.size() > 0){
                return ar;
            } else {
                System.out.println("The user-input list cannot be empty. Default list will be used");
                return defaultList();
            }
        } else {
            System.out.println("Default list will be used");
            return defaultList();
        }
    }

    public static ArrayList<String> arrayBuilder(){

        ArrayList<String> ar = new ArrayList<>();
        String userInput;

        do {
            System.out.println("Enter new list element(s):");
            userInput = userInputReader();

            String[] multiple = userInput.split(" ");

            if(multiple.length == 1){
                ar.add(userInput);
            } else {
                ar.addAll(Arrays.asList(multiple));
            }

        } while(!userInput.equals("quit"));

        ar.remove(ar.size()-1);
        return ar;
    }
}

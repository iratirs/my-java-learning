package exceptions;

import java.util.ArrayList;

public class Main extends InteractiveMethods{

    public static void m1(String a){
        System.out.println(Double.parseDouble(a));
    }

    public static void m2(){
        System.out.println("This second method will only run if there are no unhandled exceptions");
    }

    public static void exceptionsHandling(ArrayList<String> array){

        System.out.println("List to be tested: " + array);

        Boolean handleAllExceptionsYN = booleanTranslate(handleAllExceptionsYN());

        for(String element : array){

            System.out.println("When entered value {" + element + "} the output is:");

            if(handleAllExceptionsYN == true){
                try {
                    m1(element);
                } catch (NullPointerException e) {
                    System.out.println("Null format exception caught!");
                } catch (Exception e) {
                    System.out.println("Another type of exception caught!");
                } finally {
                    System.out.println("This will always print, regardless of error. In this case there are no unhandled errors");
                }
                m2();
            } else {
                try {
                    m1(element);
                } catch (NullPointerException e) {
                    System.out.println("Null format exception caught!");
                } catch (Exception e) {
                    throw new RuntimeException("Non defined exception. Method 2 will not be executed");
                } finally {
                    System.out.println("This will always print, regardless of error. In this case there might be unhandled errors");
                }
                m2();
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){

        System.out.println("Welcome to the error handling checking tool!");
        ArrayList<String> toTest = arrayConditional();
        exceptionsHandling(toTest);
    }
}

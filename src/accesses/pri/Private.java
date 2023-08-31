package accesses.pri;

public class Private {

    //Private variable c
    private int c;

    //Private method addition
    private void addition(int a, int b){
        c = a + b;
    }

    //private variables and methods can only be accessed from within the same class
    //if these need to be accessed from other classes we need to set public methods named setters and getters

    //a setter method is a public method that runs a private method from the same class
    //allows for the private method to be run from another class
    public void setterMethod(int a, int b){
        addition(a,b);
    }

    //a getter method is a public method that returns a private variable from the same class
    //allows for the private variable to be called from another class
    public int getterMethod(){
        return c;
    }
}

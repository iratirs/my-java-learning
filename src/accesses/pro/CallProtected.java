package accesses.pro;

public class CallProtected extends Protected {
    //protected variables and methods can be used by classes that extend the class where they were defined

    public static void main(String[] args){

        //need an object of the class containing the protected variable and method
        Protected obj = new Protected();

        //run the protected method from the object
        obj.addition(6, 7);

        //print the protected variable from the object
        System.out.println(obj.c);
    }
}

//Can call protected elements from within the same package or outside the package by subclass
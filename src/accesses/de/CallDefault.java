package accesses.de;

public class CallDefault {
    public static void main(String[] args){

        //need an object of the class containing the protected variable and method
        Default obj = new Default();

        //run the protected method from the object
        obj.addition(2, 19);

        //print the protected variable from the object
        System.out.println(obj.c);

    }
}

//Can call default elements from within the same package
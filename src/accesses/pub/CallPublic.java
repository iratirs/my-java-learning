package accesses.pub;

public class CallPublic {
    public static void main(String[] args){

        //need an object of the class containing the public variable and method
        Public obj = new Public();

        //run the public method from the object
        obj.addition(4, 7);

        //print the public variable from the object
        System.out.println(obj.c);

    }
}

//Can call public elements from everywhere

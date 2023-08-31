package accesses.pri;

public class CallPrivate {
    public static void main(String[] args){

        //need an object of the class containing the methods to call the setter and getter methods
        Private obj = new Private();

        //run the private method through the setter method. Will store the result in the private variable
        obj.setterMethod(4,5);

        //print the result of running the getter method, which returns the private variable set by the setter method
        System.out.println(obj.getterMethod());
    }
}

//Can call setter and getter methods from anywhere in the program as they are public
//Private elements can only be called within the class, that's why the definition of setter and getters within the class
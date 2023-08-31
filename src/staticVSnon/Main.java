package staticVSnon;

public class Main {

    public void nonStaticWithin() {
        System.out.println("Non-static method from within class");
    }

    public static void StaticWithin() {
        System.out.println("Static method from within class");
    }

    public static void main(String[] args){

        //call non-static from another class
        Methods objOut = new Methods();
        objOut.nonStatic();

        //call non-static from same class
        Main objIn = new Main();
        objIn.nonStaticWithin();

        //call static from another class
        Methods.staticClass();

        //call static from same class
        StaticWithin();
    }
}

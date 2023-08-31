package visibility;

public class Main {
    String outV;
    String outDefaultV = "I am declared non-static and initialised with a default value outside of a method";
    static String outStaticV;
    static String outStaticDefaultV = "I am declared static and initialised with a default value outside of a method";

    public String nonStaticMethod(){

        String inNonV;
        inNonV = "I am declared and initialised inside a non-static method";

        outV = "I am declared non-static outside a method, then I am initialised within a non-static method";
        outDefaultV = "I was declared non-static and initialised with a default value outside a method\nMy value is changed within a non-static method";
        outStaticV = "I am declared static outside a method, then I am initialised within non-static method";
        outStaticDefaultV = "I was declared static and initialised with a default value outside a method\nMy value is changed within a non-static method";

        //need return statement to access variable declared within so can create new variable in main
        return inNonV;
    }
    public static String staticMethod(){

        String inStatV;
        inStatV = "I am declared and initialised inside a static method";

        //non-static variables need to be access through object
        Main obj = new Main();
        obj.outV = "I am declared non-static outside a method, then I am initialised within a static method";
        obj.outDefaultV = "I was declared non-static and initialised with a default value outside a method\nMy value is changed within a static method";
        outStaticV = "I am declared static outside a method, then I am initialised within a static method";
        outStaticDefaultV = "I was declared static and initialised with a default value outside a method\nMy value is changed within a static method";

        //need return statement to access variable declared within so can create new variable
        return inStatV;

    }

    public static void main(String[] args){

        //STATIC VARIABLE FROM ANOTHER CLASS
        //as static no need for class instance or new variable
        System.out.println("\nA) Static variable from another class:\n" + StaticVars.staticV1);

        //DEFAULT VARIABLES FROM THIS CLASS

        //static - no need for class instance
        System.out.println("\nB) Default static variable from this class:\n"+ outStaticDefaultV);

        //non-static - need class instance
        Main thisClassObj = new Main();
        System.out.println("\nC) Default non-static variable from this class:\n" + thisClassObj.outDefaultV);

        //VARIABLES FROM A NON-STATIC METHOD

        thisClassObj.nonStaticMethod(); //run non-static method to initialise and change / need class instance (above)
        String inNonV = thisClassObj.nonStaticMethod(); //need to create variable from returned value
        System.out.println("\nD) Variable declared in and returned from a non-static method:\n" + inNonV);
        System.out.println("\nE) Static variable declared outside and initialised in non-static method:\n" + outStaticV);
        System.out.println("\nF) Non-static variable declared outside and initialised in non-static method:\n" + thisClassObj.outV);
        System.out.println("\nG) Static variable declared and initialised outside and changed inside:\n" + outStaticDefaultV); //same as above but now after running method
        System.out.println("\nH) Non-static variable declared and initialised outside and changed inside:\n" + thisClassObj.outDefaultV); //same as above but now after running method

        //VARIABLES FROM A STATIC METHOD

        staticMethod(); //run static method to initialise and change/ no need object
        String inStatV = thisClassObj.staticMethod(); //need to create variable from returned value
        System.out.println("\nI) Variable declared in static method:\n" + inStatV);
        System.out.println("\nJ) Static variable declared outside and initialised in non-static method:\n" + outStaticV); //same as above but now after running method
        System.out.println("\nK) Non-static variable declared outside and initialised in static method:\n" + thisClassObj.outV); //same as above but now after running method
        System.out.println("\nL) Static variable declared and initialised outside and changed inside:\n" + outStaticDefaultV); //same as above but now after running method
        System.out.println("\nM) Non-static variable declared and initialised outside and changed inside:\n" + thisClassObj.outDefaultV); //same as above but now after running method

        //VARIABLES FROM MAIN - no need static as static method
        String mainV = "I am declared and initialised within the main method";
        System.out.println("\nN) Variable declared in main:\n" + mainV);

        //NON-STATIC VARIABLE FROM ANOTHER CLASS
        StaticVars otherClassObj = new StaticVars();
        String staticV2 = otherClassObj.staticV2;
        System.out.println("\nO) Non-static variable from another class:\n" + staticV2);
    }
}

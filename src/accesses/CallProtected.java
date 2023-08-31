package accesses;

public class CallProtected extends Protected {

    public static void main(String[] args){
        Protected obj = new Protected();
        obj.addition(6, 7);
        System.out.println(obj.c);
    }
}

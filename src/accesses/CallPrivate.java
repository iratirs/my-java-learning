package accesses;

public class CallPrivate {

    public static void main(String[] args){
        Private obj = new Private();
        obj.setterMethod(4,5);
        System.out.println(obj.getterMethod());
    }
}

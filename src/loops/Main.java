package loops;
import java.util.ArrayList;

/*
Exercise:
    use a for loop to print elements of an ArrayList
    use a stream to print elements of an ArrayList
 */

public class Main {

    public ArrayList<String> define(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Irati");
        names.add("Govind");
        names.add("Nicky");
        return names;
    }

    public void loopMethod(){
        Main obj = new Main();
        ArrayList<String> names = obj.define();
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }

    public void streamMethod(){
        Main obj = new Main();
        ArrayList<String> names = obj.define();
        names.stream().forEach(x -> System.out.println(x));
    }

    public static void main(String[] args){
        Main obj = new Main();
        System.out.println("Streamed:");
        obj.streamMethod();
        System.out.println("\nLooped:");
        obj.loopMethod();
    }
}

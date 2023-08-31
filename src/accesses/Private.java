package accesses;

public class Private {

    private int c;
    private void addition(int a, int b){
        c = a + b;
    }

    public void setterMethod(int a, int b){
        addition(a,b);
    }

    public int getterMethod(){
        return c;
    }
}

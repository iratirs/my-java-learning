package post_pre_increments;

public class PostPreInc {
    public static void main(String[] args) {

        int pre = 0;
        int post = 0;

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("In iteration " + (i+1) +
                    ", pre-increment value will be " + (++pre) +
                    ", while post-increment value is " + (post++) + "."
            );
        }
    }
}
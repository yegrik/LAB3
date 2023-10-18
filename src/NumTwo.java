import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NumTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i <=4;i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(10, 99);
            arr.add(randomNumber);
            System.out.println(randomNumber);
            if (i > 0){
                if(arr.get(i) <= arr.get(i-1)){
                    System.exit(1);
                }
            }

        }
        System.out.println("YEeeeEE");
    }
}

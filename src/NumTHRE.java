import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumTHRE {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static ArrayList<Integer> arr_chet = new ArrayList<Integer>();
    public static int enter_chech_size(){
        System.out.println("Enter Size of arrr:");
        int n = input.nextInt();
        while (n < 0) {
            System.out.println("Try again");
            n = input.nextInt();
        }
        return n;
    }

    public static void main(String[] args){
        int size = enter_chech_size();
        for (int i = 0; i < size; i++){
            arr.add(ThreadLocalRandom.current().nextInt(0, size));
            if(i % 2 == 0){
                arr_chet.add(arr.get(i));
            }
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(arr_chet);
    }
}

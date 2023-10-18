import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void ar_math(int size){
        ArrayList<Double> array = new ArrayList<Double>();
        for (int i = 0; i < size; i++){
            array.add(i, Math.random());
            System.out.println(array.get(i));
        }
        Collections.sort(array);
        System.out.println("\nAfter Sorting:\n");
        for (int i = 0; i < size; i++){
            System.out.println(array.get(i));
        }
    }
    public static void ar_rand(int size){
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++){
            array.add(i, rand.nextInt());
            System.out.println(array.get(i));
        }
        Collections.sort(array);
        System.out.println("\nAfter Sorting:\n");
        for (int i = 0; i < size; i++){
            System.out.println(array.get(i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите размер массива:\n");
        int size = input.nextInt();
        ar_math(size);
        System.out.println("\n");
        ar_rand(size);
    }
}
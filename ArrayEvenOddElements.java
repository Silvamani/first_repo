import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEvenOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        int[] array = new int[arraysize];
        ArrayList<Integer> EvenArrayList = new ArrayList<Integer>();
        ArrayList<Integer> OddArrayList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] % 2 == 1) {
                OddArrayList.add(array[i]);
            }else {
                EvenArrayList.add(array[i]);
            }
        }
        System.out.println("EVEN NUMBERS: "+EvenArrayList+"\n"+"ODD NUMBERS: "+OddArrayList);
    }    
}

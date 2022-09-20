import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ARRAY SIZE: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                    min = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }    
}
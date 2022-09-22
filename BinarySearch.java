import java.util.Scanner;

public class BinarySearch {
    static void binarySearch(int[] arr, int key, int low, int high){
        int mid = (low+high) / 2; 
        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            }else if (arr[mid] == key){
                System.out.println("ELEMENT IS FOUND...");
                break;
            }else{
                high = mid-1;
            }
            mid = (low + high) / 2; 
        }
        if (low > high) {
            System.out.println("ELEMENT IS NOT FOUND...");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < args.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER KEY: ");
        int key = sc.nextInt();
        sc.close();
        int low = 0, high = arr.length - 1;
        binarySearch(arr,key,low, high);
    }    
}

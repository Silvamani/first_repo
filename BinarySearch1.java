import java.util.Scanner;

public class BinarySearch1{
    static int binarySearch1(String[] arr, String key){
        int low = 0, high = arr.length - 1;
        while (low <= high){ 
            int mid = (low + high) / 2;
            int result = key.compareToIgnoreCase(arr[mid]);
            if (result == 0) {
                return mid;
            }else if(result < 0) {
               return mid = mid - 1;
            }else{
                return mid = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE: ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("ENTER KEY: ");
        String key = sc.nextLine();
        sc.close();
        int result = binarySearch1(str, key);
        if(result == -1) {
            System.out.println("ELEMENT NOT FOUND: ");
        }else{
            System.out.println("ELEMENT FOUND: ");
        }
    }
}
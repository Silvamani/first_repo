import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ARRAY SIZE: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("ENTER ARRAY ELEMENTS: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("ENTER KEY: ");
		int key = sc.nextInt();
		boolean found = Search(arr, key);
        if (found == true) {
            System.out.println("ELEMENT FOUND...");
        }else{
            System.out.println("ELEMENT NOT FOUND...");
        }
	}
    static boolean Search(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>key) {
                count++;
            }   
        }
        if (count == 0) {
            return false;
        }else{
            return true;
        }
    }
}
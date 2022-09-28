package ASSESSMENTS;

import java.util.Scanner;

public class BiggestSmallestArray1 {
    class Sorting{
        public static void Sort(int[] arr,int n, int[] temparr) {
            int arrIndex = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-1; j++) {
                    if (arr[j] < arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for (int i = 0, j = n-1 ; i < n/2 || j >= n/2; i++, j--) {
                if(arrIndex < n){
                    temparr[arrIndex] = arr[i];
                    arrIndex++;
                }
                if (arrIndex < n) {
                    temparr[arrIndex] = arr[j];
                    arrIndex++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temparr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Sorting.Sort(arr,n, temparr);
        for (int i = 0; i < n; i++) {
            System.out.println(temparr[i]);
        }
    }
}

package ASSESSMENTS;
public class BiggestSmallestArray {
    public static void main(String[] args) {
        int[] arr = {7,5,8,9,10,34,15};
        int[] arr2 = new int[arr.length];
        int arrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0,j = arr.length-1; i <= arr.length/2||j >= arr.length/2; ++i,j--) {
            if (arrIndex < arr.length) {
                arr2[arrIndex] = arr[i];
                arrIndex++;
            }
            if(arrIndex < arr.length) {
                arr2[arrIndex] = arr[j];
                arrIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
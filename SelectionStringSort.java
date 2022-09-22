import java.util.Scanner;

public class SelectionStringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ARRAY SIZE: ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.print("ENTER ARRAY ELEMENTS: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < str.length-1; i++) {
            int index = i;
            String minString = str[i];
            for (int j = i+1; j < str.length; j++) {
                if (str[j].compareTo(minString)>0) {
                    minString = str[j];
                    index = j;
                }
            }
            if (index != i) {
                String temp = str[index];
                str[index] = str[i];
                str[i] = temp;
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }    
}
import java.util.Scanner;
public class SmallestEvenNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE: ");
        int size = sc.nextInt();
        System.out.println("ENTER ARRAY ELEMENTS: ");
        int[] elements = new int[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = sc.nextInt();
        }
        sc.close();
        int smallest = 0;
        for (int i = 0; i < elements.length-1; i++) {
            if (elements[i]>elements[i+1]) {
                if(smallest % 2 == 0) {
                    smallest = elements[i+1];
                }
            }
        }
        System.out.println(smallest);
    }
}
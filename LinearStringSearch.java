import java.util.Scanner;

public class LinearStringSearch {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ARRAY SIZE: ");
		int size = sc.nextInt();
		String[] str = new String[size];
		System.out.println("ENTER ARRAY ELEMENTS: ");
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		System.out.println("ENTER KEY: ");
		String key = sc.nextLine();
		int x = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase(key)) {
				System.out.println("ELEMENT FOUND AT "+(i));
				x = 1;
                break;
			}
		}
		if(x == 0) {
			System.out.println("ELEMENT NOT FOUND...");
		}
	}    
}
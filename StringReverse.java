import java.util.Scanner;
class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c;
        String s = "";
        sc.close();
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            s = c + s;
        }
        System.out.println(s);
    }
}
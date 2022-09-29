public class ForLoop {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,9,7,8,2};
        int[] b = {1,2,3,4,5,6,7,8};
        for(int i:a) {
            for (int j : b) {
                System.out.println(i+j);
            }
        }
    }
}
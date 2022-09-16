package OOPS;

public class Cars_In_Banglore {
    private String color;
    private String city;
    private static int countOfTheCars;
    public Cars_In_Banglore(String color, String city){
        if ((color.equals("black"))&&(city.equals("bangalore"))) {
            countOfTheCars++;
        }
    }
    public static void main(String[] args) {
        Cars_In_Banglore Cr = new Cars_In_Banglore("black","bangalore");
        Cars_In_Banglore Cr1 = new Cars_In_Banglore("red","bangalore");
        Cars_In_Banglore Cr2 = new Cars_In_Banglore("black", "bangalore");
        Cars_In_Banglore Cr3 = new Cars_In_Banglore("yellow","hyderabad");
        Cars_In_Banglore Cr4 = new Cars_In_Banglore("silver", "Goa");
        method1();
    }
    public static void method1(){
        System.out.println("Number of blue cars running in Bangalore is: "+Cars_In_Banglore.countOfTheCars);
    }
}
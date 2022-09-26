import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"rock", "paper","scissors"};
        String systemOption,userOption;   
        while(true){
            systemOption = str[new Random().nextInt(str.length)];
            while (true){
                System.out.println("CHOOSE OPTION: "+" ROCK "+" PAPER "+" SCISSORS ");
                userOption = sc.nextLine();
                if(userOption.equalsIgnoreCase("ROCK")||userOption.equalsIgnoreCase("PAPER")||userOption.equalsIgnoreCase("SCISSORS")){
                    break;
                }
                System.out.println("USEROPTION IS NOT VALLIED...  "+ userOption);
            }
            System.out.println("COMPUTER PLAYED: " + systemOption);
            if (userOption.equalsIgnoreCase(systemOption)) {
                System.out.println("GAME WAS TIE...");
            }else if (userOption.equalsIgnoreCase("rock")){
                if(systemOption.equalsIgnoreCase("paper")){
                    System.out.println("YOU LOSE...");
                }else if(systemOption.equalsIgnoreCase("scissors")){
                    System.out.println("YOU WIN!");
                }
            }else if (userOption.equalsIgnoreCase("paper")){
                if(systemOption.equalsIgnoreCase("rock")){
                    System.out.println("YOU WIN...");
                }else if(systemOption.equalsIgnoreCase("scissors")){
                    System.out.println("YOU LOSE...");
                }
            }else if (userOption.equalsIgnoreCase("scissors")){
                if(systemOption.equalsIgnoreCase("paper")){
                    System.out.println("YOU WIN...");
                }else if(systemOption.equalsIgnoreCase("rock")){
                    System.out.println("YOU LOSE...");
                }
            }
            System.out.println("PLAY AGAIN YES/NO: ");
            String play = sc.nextLine();
            if (!play.equalsIgnoreCase("YES")) {
                break;
            }
        }
        sc.close();
    }
}
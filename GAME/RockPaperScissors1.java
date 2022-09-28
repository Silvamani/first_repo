package GAME;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors1 {
    static class game{
		static int userWin = 0;
		static int machineWin = 0;
		public static void winner(String machine) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ENTER YOUR OPTION: ");
			String userinput = sc.nextLine();
			System.out.println("YOU SELECTED: "+userinput);
			System.out.println("MACHINE SELECTED: "+machine);
			while(true) {
				if(userinput.equalsIgnoreCase("rock")||userinput.equalsIgnoreCase("paper")||userinput.equalsIgnoreCase("scissors")) {
					break;
				}
				System.out.println("INVALID INPUT...."+userinput);
				break;
			}
			while(true) {
				if(userinput.equalsIgnoreCase(machine)) {
					System.out.println("GAME WAS A TIE...");
				}else if(userinput.equalsIgnoreCase("rock")) {
					if(machine.equalsIgnoreCase("paper")) {
						System.out.println("YOU LOSE...!");
						machineWin++;
					}else if(machine.equalsIgnoreCase("scissors")) {
						System.out.println("YOU WIN...!");
						userWin++;
					}
				}else if(userinput.equalsIgnoreCase("paper")) {
					if(machine.equalsIgnoreCase("scissors")) {
						System.out.println("YOU LOSE...!");
						machineWin++;
					}else if(machine.equalsIgnoreCase("rock")) {
						System.out.println("YOU WIN...!");
						userWin++;
					}
				}else if(userinput.equalsIgnoreCase("scissors")) {
					if(machine.equalsIgnoreCase("paper")) {
						System.out.println("YOU WIN...!");
						userWin++;
					}else if(machine.equalsIgnoreCase("rock")) {
						System.out.println("YOU LOSE...!");
						machineWin++;
					}
				}
				System.out.println("PLAY AGAIN yes/no");
				String one = sc.nextLine();
				if(!one.equalsIgnoreCase("no")) {
					game.winner(machine);
				}else {
					System.out.println("GAME OVER...!");
					break;
				}
				break;
			}
		}
		public static void main(String[] args) {
			String[] str = {"rock","paper","scissors"};
			String machine = str[new Random().nextInt(str.length)];
			game.winner(machine);
			if (userWin > machineWin) {
				System.out.println("YOU SCORE: "+ userWin + " YOU WON...!");
			} else {
				System.out.println("MACHINE SCORE: "+ machineWin + " MACHINE WON...!");
			}
		}
	}
}

package CS4Exercise4;

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int ingame = 0;
                
                Scanner game = new Scanner(System.in);
		
                while(ingame == 0){
		System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n1. Start Game\n2. Change number of rounds\n3. Exit Application"); 
                int mainmenu = game.nextInt();
                while(mainmenu < 1 || mainmenu > 3){
                    System.out.println("Please input a valid number.(Only 1, 2, or 3.)\nWelcome to Rock, Paper, Scissors. Please choose an option:\n1. Start Game\n2. Change number of rounds\n3. Exit Application");
                    mainmenu = game.nextInt();
                }
                
                switch(mainmenu){
                    case 1:
                        System.out.println("\nThis match will be first to " + roundsToWin + " wins.");
                int playerScore = 0 ;
                int computerScore = 0;
                ingame = 1;
                break;
                    case 2:
                        System.out.println("\nHow many wins are needed to win a match?");
                        roundsToWin = game.nextInt();
                        while (roundsToWin <= 0){
                            System.out.println("Please input a valid number.");
                            roundsToWin = game.nextInt();
                        }
                        System.out.println("\nNew setting has been saved!\n");
                    break;
                    case 3: 
                        System.out.println("\nThank you for playing!");
                    System.exit(0);
                }
                }
                
                while(ingame == 1){
                   System.out.println("The computer has selected its move. Select your move:\n1. Rock\n2. Paper\n3. Scissors");
                   int player = game.nextInt();
                   int random = (int) Math.floor(Math.random()*3) + 1;
                  
                }
	}
}

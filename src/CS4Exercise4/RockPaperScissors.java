package CS4Exercise4;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
		
		System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n1. Start Game\n2. Change number of rounds\n3. Exit Application");
	}
}
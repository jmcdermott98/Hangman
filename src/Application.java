import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to play Hangman Yes/No?");
		String decision = input.nextLine();
		
		if(decision == "Yes") {
			Hangman;
		}//end if
		if(decision == "No") {
			System.out.printf("You had %d wins and %d losses." winCount, lossCount);
		}//end if

	}//end main method

}//end of class

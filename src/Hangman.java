import java.util.Scanner;
public class Hangman {

		// TODO Auto-generated constructor stub
	
	
	private int wins;
	private int losses;
	private String currentWord;
	
	//constructor
	public Hangman() {
		String chooseWord = currentWord;
		
	}
	
	private static void loadWL() {
		
	}
	
	private static void writeWL() {
		int winCount;
		int lossCount;
		
		
	}
	
	public void playGame() {
        		char positions[] = new char[currentWord.length()];
                for (int i = 0; i < currentWord.length(); i++) {
                    positions[i] = '_';
                    if(currentWord.charAt(i) == ' ') {
                    	positions [i] = ' ';
                    }
                    	i++;
                }    
                int attempts = 6;
                System.out.print(positions);
                System.out.println("    Attempts remaining: " + attempts);
                
                Scanner s = new Scanner(System.in);
                while(attempts>0) {
                	char x = s.next().charAt(0);
                	if(currentWord.contains(x+"")){
                		for(int y=0; y < currentWord.length(); y++) {
                			if(currentWord.charAt(y) == x) {
                				positions[y] = x;
                			}//end if
                		}//end for
                	}//end if
                	else {
                		attempts--;
                	}//end else
                	if(currentWord.equals(String.valueOf(positions))) {
                		System.out.println(positions);
                    	System.out.println("You Won!");
                    	winCount++;
                    	System.out.print("You have won %d games and lost %d games." winCount, lossCount);
                	}//end if
                	System.out.print(positions);
                	System.out.println("    Attempts remaining: " + attempts);
                	
                	if(attempts == 0) {
                		System.out.println("You lose! Ha!");
                		loseCount++
                		System.out.print("You have won %d games and lost %d games." winCount, lossCount);
                	}
                
                
                }//end while
                       
		
		
	}//end playgame
	
	

}//end class

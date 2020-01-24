import java.util.Random;
import java.util.*;
public class Dictionary {

	
	private String[] wordList;
	int currentCard;
	private SecureRandom randomNumbers;
	
	//constructor
	public Dictionary(String fileName) {
		
	}
	
	private void readFile(String fileName) {
		//Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(new File("fileName"));
		String[] wordList = new String[scanner];
		
	}
	
	public String chooseWord() {
		Random randomWord = new Random();
		String choosenWord = randomWord.nextLine(wordList);
		return choosenWord;
			
	}
	
}//end class

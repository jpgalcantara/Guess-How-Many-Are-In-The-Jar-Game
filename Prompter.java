import java.io.Console;

public class Prompter {
  Console console = System.console();
  
  public String promptForItem() {   
    String jarItem = console.readLine("What will be inside the jar? ");
    return jarItem;
  }
  
  public int promptForQuantity() {
    String jarQuantity = console.readLine("What is the maximum quantity that will fit in this jar? ");
    return Integer.parseInt(jarQuantity);
  }
  
  public String playerName() {
    String player = console.readLine("Enter your name: ");
    return player;
  }
  
  public String newPlayer() {
    String newName = console.readLine("Do you want to enter a new name?(Y/N)");
    return newName;
  }
  
  public int promptForGuess() {
    String guess = console.readLine("Guess: "); 
    return Integer.parseInt(guess);
  }
  
  public String playAgain() {
    String answer = console.readLine("\n\nPlay again?(Y/N)");
    return answer;
  }
  
}
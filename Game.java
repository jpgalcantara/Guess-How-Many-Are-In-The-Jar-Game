public class Game {
 
  public static void main(String[] args) {
    // Your code here
    
    System.out.println("Guess How Many are in the Jar");
    System.out.println("*****************************\n");
    System.out.println("ADMINISTRATOR");
    System.out.println("*****************************\n");
    
    Prompter prompter = new Prompter();
    Jar jar = new Jar(prompter.promptForItem(),prompter.promptForQuantity());
    
    String answer = "Y";
    int highScore = 1000;
    
    System.out.println("\nPLAYER");
    System.out.println("*****************************\n");
    
    String playerName = prompter.playerName();
    String newPlayerName = playerName;
    System.out.printf("\nHello %s! The jar contains %s. Guess between 1 to %d to win the game!\n", playerName, jar.getItemName(), jar.getMaxNumber());
    
    while (answer.equalsIgnoreCase("Y")) {
    
      int guessJar = jar.fillJar();  
      int guess = prompter.promptForGuess();
      int counter = 1;
      while (guess != guessJar) {
        if (guess > guessJar) {
          System.out.println("Too high!");
        } else {
          System.out.println("Too low!");
        }
        guess = prompter.promptForGuess();
        counter++;
      }
      
      System.out.printf("\nYou got it! There are %d %s in the jar! It took you %d tries to guess it.\n", guess, jar.getItemName(), counter);
      
      if (highScore > counter) {
        highScore = counter;
        System.out.printf("\nHighscore is: %d by %s", highScore, newPlayerName);
      } else {
        System.out.printf("\nHighscore is: %d by %s", highScore, playerName);
      }        
                        
      answer = prompter.playAgain();
              
      if (answer.equalsIgnoreCase("y")) {
        String newName = prompter.newPlayer();
          if (newName.equalsIgnoreCase("y")) {
            newPlayerName = prompter.playerName();
            System.out.printf("\nHello %s! The jar contains %s. Guess between 1 to %d to win the game!\n", newPlayerName, jar.getItemName(), jar.getMaxNumber());
          } else {
            playerName = newPlayerName;
            System.out.printf("\nHello %s! The jar contains %s. Guess between 1 to %d to win the game!\n", playerName, jar.getItemName(), jar.getMaxNumber());
          }
       }
      
      } 

  }
  
}
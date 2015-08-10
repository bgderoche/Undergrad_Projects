  /*
 * Rebecca Gruntz
 * 04/10/13
 * CSCI 1583-601
 * Assignment 5 : A die-game: Pig! */

import java.util.Scanner;

/**
 * A simple text user interface for PigGame
 */
class PigTUI{
  private static final int EXIT = 0;
  private static final int PLAY = 1;
  private static final int NO_CHOICE = -1;

  private Player player1;
  private Player player2;
  private PigGame myGame;
  private Scanner in;
  
  /**
   * Create a new user interface.
   */
  public PigTUI(){
    this.player1 = new Player("Player 1");
    this.player2 = new Player("Player 2");
    this.myGame = null;
    this.in = new Scanner(System.in);
  }

  /**
   * Start the interface.
   */
  public void start()throws InterruptedException {
    int choice = NO_CHOICE;
    while( choice != EXIT ){
      displayMenu();
      choice = readIntWithPrompt("Enter choice: ");
      executeChoice(choice);
    }
  }   
  
  
  public int rollAgain(){
    int choice = NO_CHOICE;
    this.rollMenu();
    choice = readIntWithPrompt("Enter choice: ");
    return choice;
  }

 
  /**
   * Play a game with Player 1 and Player 2.
   */
  private void playGame()throws InterruptedException {
    this.myGame = new PigGame(this.player1, this.player2);
    System.out.println(player1.getName() + " will go first.\n");
    while (!this.myGame.gameOver()){
      this.myGame.playGame();
      Thread.sleep(1000);
    }
  }
  
  private void displayMenu(){
    System.out.println();
    System.out.println("Enter number for menu choice:");
    System.out.println("Play New Game........................" + PLAY);
    System.out.println("Exit................................." + EXIT);
  }
  
  private void rollMenu(){
    System.out.println();
    System.out.println("Enter number for menu choice:");
    System.out.println("Roll Die for points........................................." + PLAY);
    System.out.println("Keep points; pass turn to next player......................." + EXIT);
  }

  private void executeChoice(int choice)throws InterruptedException {
    System.out.println();
    if (choice == PLAY){
      this.playGame();
    } else if (choice == EXIT){
      System.out.println("goodbye!");
    } else {
      System.out.println("Invalid input. try again.");
    }
  }
  
  
 
  


  public void reportPlay(Player player){
    System.out.println(player.getName() + " rolled a " + player.getLastRoll());
    System.out.println(player.getName() + "'s current turn score is: " + player.getTurnScore());
    System.out.println(player.getName() + "'s total score is: " + player.getTotalScore() + "\n");
  }

  public String displayScore(Player player){
    return (player.getName() + "'s total Score: " + player.getTotalScore());
  }

  public void displayZeroMessage(Player player){
    System.out.println("Sorry, " + player.getName() + " you rolled: 1");
    System.out.println(player.getName() + "'s total score is: " + player.getTotalScore() + "\n");
    System.out.println("It is the next player's turn.\n");
  }


  public void displayWinMessage(Player player)throws InterruptedException {
    System.out.println("Congratulations " + player.getName() + ", you win!");
    System.out.println("Final Score: " + this.displayScore(player));
    this.start();
  }
  
  public void nextPlayerMessage(Player player){
    System.out.println(player.getName() + "'s total score is: " + player.getTotalScore() + "\n");
    System.out.println("It is the next player's turn.\n");
  }
  

  private int readIntWithPrompt(String prompt){
    System.out.println(prompt);
    System.out.flush();
    while(!in.hasNextInt()){
      in.nextLine();
      System.out.print(prompt);
      System.out.flush();
    }
    int input = in.nextInt();
    in.nextLine();
    return input;
  }
}

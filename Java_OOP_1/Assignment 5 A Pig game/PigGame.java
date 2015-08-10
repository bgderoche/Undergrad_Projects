/**
 * Rebecca Gruntz
 * 04/10/13
 * CSCI 1583-601
 * Assignment 5 : A die-game: Pig!
 */

class PigGame{

  private Player player1;
  private Player player2;
  private Player nextPlayer;
  private Player previousPlayer;
  private PigTUI myUI;
  private Die myDie;


  /**
   * Create a new PigGame, with specified players, die, and user interface. The first player
   * specified (p1) plays first in the game.
   * @ensure this.currentPlayer().equals(p1)
   *         this.nextPlayer().equals(p2)
   */
  public PigGame(Player p1, Player p2){
    this.player1 = p1;
    this.player2 = p2;
    this.nextPlayer = p1;
    this.previousPlayer = null;
    this.myDie = new Die(6); // Rules of pig requires 6-sided die
    this.myUI = new PigTUI();    
  }
  
  /**
   * The player whose turn is next
   */
  public Player nextPlayer(){
    return this.nextPlayer;
  }
  
  /**
   * The player who last played; returns null if no has made a play yet.
   */
  public Player previousPlayer(){
    return this.previousPlayer;
  }

 /**
  * Determine if game is over. The first player to reach/exceed 100 
  * points wins, and the game is over.
  */
  public boolean gameOver(){
    if (this.nextPlayer.isWinner())
      return true;
    else
      return false;
  }
  
  /**
   * Command to begin playing game
   */
  public void playGame()throws InterruptedException {
    if (!this.gameOver()){
      this.takeTurn(this.nextPlayer());
      if (this.nextPlayer.isWinner()){
        this.myUI.displayWinMessage(this.nextPlayer());
      } else {
        this.previousPlayer = this.nextPlayer;
        this.nextPlayer = this.otherPlayer(this.nextPlayer);
      }
    }
  }
  
  

  /**
   * Command to make the player take a turn, rolling the die until
   * either the die rolls a one or player decides to save his/her
   * score.
   *
   */
  public void takeTurn(Player player){
    while (!player.isWinner()){
      int choice = myUI.rollAgain();
      if (choice == 0){
        player.keepScore();
        player.clearCurrentTurnScore();
        myUI.nextPlayerMessage(player);
        break;
      } else if (choice == 1){
        this.myDie.rollDie();
        int value = this.myDie.getRollValue();
        player.saveTheLastRoll(value);
        player.addToCurrentTurnScore(value);
        if (value == 1){
          player.clearCurrentTurnScore();
          myUI.displayZeroMessage(player);
          break;
        }else{          
          myUI.reportPlay(player);
        }
      } else {
        System.out.println("Invalid Input! Try Again!");
      }
    }
  }
       
        
                     
   
  /**
   * The player who is not the specified.
   */
  public Player otherPlayer(Player player) {
    if (player == player1)
      return player2;
    else
      return player1;
  }
  
  
  
}

/*
 * Rebecca Gruntz
 * 04/10/13
 * CSCI 1583-601
 * Assignment 5 : A die-game: Pig! */


/**
 * Models a player object
 */
public class Player{
  private String name; // the name of the player
  private int totalScore; // total accumulated score for the game
  private int currentTurnScore; //score for current turn
  private int lastRoll; //the value of the last roll the player rolled
  


  /**
   * Create a new Player with specified name, initial total score,
   * current score, and last roll.
   * @ensure this.getName().equals(name)
   */
  public Player(String name){
    this.name = name;
    this.totalScore = 0;
    this.currentTurnScore = 0;
    this.lastRoll = 1;
  }
    

  /**
   * This Player's name.
   */
  public String getName(){
    return this.name;
  }

  /**
   * This Player's total score. Returns 0 if Player has not
   * taken a turn yet.
   * @ensure this.getTotalScore() >= 0
   */
  public int getTotalScore(){
    return this.totalScore;
  }

  /**
   * This Player's score count for his/her current turn. Returns
   * 0 if Player has not rolled die yet.
   * @ensure this.currentTurnScore >= 0
   */
  public int getTurnScore(){
    return this.currentTurnScore;
  }

  /**
   * The value of the die on the last roll for this Player.
   * The value of the die is between 1 - 6 (# of sides on die)
   * @ensure this.getLastRoll >= 1 && this.getLastRoll <= n
   */
  public int getLastRoll(){
    return this.lastRoll;
  }
  
  public boolean isWinner(){
    if (this.getTurnScore() + this.getTotalScore() >= 10)
      return true;
    else
      return false;
  }


  /**
   * Reset players current turn score back to 0 when a 1 is rolled.
   * @ensure this.getTurnScore() == 0
   */
  public void clearCurrentTurnScore(){
    this.currentTurnScore = 0;
  }


  /**
   * Add value of last roll to the current turn score
   * @require value >= 1 && value <= 6
   * @ensure this.getTurnScore() == this.getTurnScore + value
   */
  public void addToCurrentTurnScore(int value){
    this.currentTurnScore = this.currentTurnScore + value;
    }

  /**
   * Save the current turn score to the total score.
   * @ensure this.getTotalScore() == this.getTurnScore() +
   *            this.getTotalScore()
   */
  public void keepScore(){
    this.totalScore = this.totalScore + this.currentTurnScore;
  }

  /**
   * Saves the value of the last roll
   * @require value >= 1 && value <= 6
   */
  public void saveTheLastRoll(int value){
    this.lastRoll = value;
  }

  
  /**
   * Reesets all scores to 0
   * @ensure this.getTurnScore() == 0
   *         this.getTotalScore() == 0
   */
  public void resetScores(){
    this.currentTurnScore = 0;
    this.totalScore = 0;
  }


}

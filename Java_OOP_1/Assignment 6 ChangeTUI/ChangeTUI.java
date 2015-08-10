import java.util.Scanner;

/**
 * Rebecca Gruntz
 * CSCI 1583
 * Assignment 6 - A TUI for Change Calculator
 * 03/20/13
 */

public class ChangeTUI{
  private Scanner in;
  
  public ChangeTUI(){
    this.in = new Scanner(System.in);
  }
  
  public void start(){
    boolean goOn = true;
    
    while(goOn){
      goOn = readYes("Would you like to calculate your change? (type yes or no)");
      if(goOn){
        System.out.println("Input total change: (0-99)");
        int input = in.nextInt();
        System.out.println("You entered " + input + " cents. Calculating change...");
        System.out.println();
        ChangeCalculator change = new ChangeCalculator(input);
        change.calculateChange(input);
        
        System.out.println("Number of quarters: " + change.getQuarters());
        System.out.println("Number of dimes: " + change.getDimes());
        System.out.println("Number of nickels: " + change.getNickels());
        System.out.println("Number of pennies: " + change.getPennies());        
      }
    }
    System.out.println("Good-bye!");
  }
  
  /**
   * If user enters "yes," boolean == true and program will go on
   */
  private boolean readYes(String prompt){
    System.out.println(prompt);
    System.out.flush();
    String input;
    if(in.hasNext()){
      input = in.next();
      input = input.toLowerCase();
      if(input.equals("yes")){
        return true;
      } else {
        return false;
      } 
    } else {
      return false;
    }
  }
}
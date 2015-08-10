/*Rebecca Gruntz
 * CSCI 1583
 * Assignment 3 - A Change Calculator
 * Spring 2013 */


class ChangeCalculator{
  private int changeValue; //amount of change to be
                           //given
  private int quarters; // number of quarters to be given
  private int dimes;    // number of dimes to be given
  private int nickels;  // number of nickels to be given
  private int pennies;  // number of pennies to be given

  //Constructor
  public ChangeCalculator(int value){
    this.changeValue = value;
    this.quarters = -1;
    this.dimes = -1;
    this.nickels = -1;
    this.pennies = -1;
  }


  //queries to retrieve the instance variable values
  public int getQuarters(){
    return this.quarters;
  }

  public int getDimes(){
    return this.dimes;
  }

  public int getNickels(){
    return this.nickels;
  }

  public int getPennies(){
    return this.pennies;
  }


  //Command to calculate change
  //will calculate how many quarters, nickels,
  //dimes, and pennies to give for change with
  //a value of changeValue

  public void calculateChange(int input){

    quarters = this.changeValue / 25; // To get the number of quarters take the amount of change
                                      // and divide it by 25 (the value of a quarter).

    dimes = (this.changeValue % 25) / 10; // To get the number of dimes take the remainder
                                          // from the quarters calculation and divide by 10 (value of dime).

    nickels = ((this.changeValue % 25) % 10) / 5; // To get the number of nickels take the remainder
                                                  // from the quarter and dimes calculation and divide by 5.

    pennies = (((this.changeValue % 25) % 10) % 5) / 1;

  }


}

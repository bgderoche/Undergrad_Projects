/* Rebecca Gruntz
 * CSCI 1583
 * Assignment 3
 * 02/06/13 */


class change{
  public static void main(String[] args){
    int totalChange = Integer.parseInt(args[0]);

    System.out.println("total change:" + totalChange + "cents");
    System.out.println();


    ChangeCalculator changeMaker = new ChangeCalculator(totalChange);
    changeMaker.calculateChange();

    System.out.println("Number of quarters:" + changeMaker.getQuarters());
    System.out.println("Number of dimes:" + changeMaker.getDimes());
    System.out.println("Number of nickels:" + changeMaker.getNickels());
    System.out.println("Number of pennies:" + changeMaker.getPennies());



  }
}

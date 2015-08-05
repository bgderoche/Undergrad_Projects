import java.util.Scanner;

class DieTest{
  
  public static void main(String[] args){
    System.out.println("How many sides do you want your die to have?");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.println("Your die will have " + num + " " + "sides.");

    Die d = new Die(num);
    d.rollDie();
    System.out.println("You rolled a" + " " + d.getRollValue());
    System.out.println("Do you want to roll again?");
    System.out.println("1 for yes and any other number for no");
    Scanner in2 = new Scanner(System.in);
    int answer = in2.nextInt();
    while (answer == 1) {
      d.rollDie();
      System.out.println("You rolled a" + " " + d.getRollValue());
      System.out.println("Do you want to roll again?");
      System.out.println("1 for yes and any other number for no");
      answer = in2.nextInt();
    }
    System.out.println("Thank you for playing!");
}
}

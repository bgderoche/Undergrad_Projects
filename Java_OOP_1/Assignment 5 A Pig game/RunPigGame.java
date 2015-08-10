/*
 * Rebecca Gruntz
 * 04/10/13
 * CSCI 1583-601
 * Assignment 5 : A die-game: Pig! */

class RunPigGame{
  public static void main(String[] args){
    PigTUI myTUI = new PigTUI();
    try{
    myTUI.start();
    } catch (InterruptedException e) {}
  }
}

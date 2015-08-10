/**
 * Rebecca Gruntz
 * 04/10/13
 * CSCI 1583-601
 * Assignment 5 : A die-game: Pig! */

import java.util.Random;



public class Die{

  private int nSides; // number of sides the die will have
  private int rollValue; // the value of last roll of die
  Random gen;

  public Die(int nSides){
    this.nSides = nSides;
    this.gen = new Random();
  }

  public int getNSides (){
    return nSides;
  }

  public int getRollValue(){
    return rollValue;
  }

  public void rollDie(){
    rollValue = gen.nextInt(nSides)+1;

  }

  public String toString(){
    return Integer.toString(this.rollValue);
  }

}

/**
 * Rebecca Gruntz
 * Spring 2013
 * CSCI 1583
 * Assignment 2 - Main Method and Test Cases for ComplexNumber class
 */

public class ComplexTest{
  
  public static void main(String[] args){
    ComplexNumberTest test;
    test = new ComplexNumberTest();
    test.runTest();
  }
} // end main method

/**
 * ComplexNumber Test cases
 */
class ComplexNumberTest{
  
  private ComplexNumber num1;
  private ComplexNumber num2;
  
  // create new ComplexNumberTest
  public ComplexNumberTest(){    
    this.num1 = new ComplexNumber(1,2);
    this.num2 = new ComplexNumber(3,4);    
  }
  
  // Command to run test cases
  public void runTest(){
    testGetA();
    testGetB();
    testAdd();
    testSubtract();
    testMultiply();
    testDivide();
  }
  
  // tests the method getA() in ComplexNumber class
  public void testGetA(){
    System.out.println("testGetA()");
    System.out.println("value a of num1 is: " + num1.getA());
    System.out.println("value a of num2 is: " + num2.getA());
    System.out.println("end of testGetA ");    
  }
  
  // tests the method getB() in ComplexNumber class
  public void testGetB(){
    System.out.println("testGetB()");
    System.out.println("value b of num1 is: " + num1.getB());
    System.out.println("value b of num2 is: " + num2.getB());
    System.out.println("end of testGetB ");   
  }
  
  
  
  // tests the method add() in ComplexNumber class
  public void testAdd(){
    System.out.println("testAdd ");
    System.out.println("Complex A: " + num1.toString());
    System.out.println("Complex B: " + num2.toString());
    num1.add(num2);
    System.out.println("Complex A + Complex B = " + num1.toString());
    System.out.println("end of testAdd ");
  }
  
  // tests the method subtract() in ComplexNumber class
  public void testSubtract(){
    System.out.println("testSubtract ");
    System.out.println("Complex A: " + num1.toString());
    System.out.println("Complex B: " + num2.toString());
    num1.subtract(num2);
    System.out.println("Complex A - Complex B = " + num1.toString());
    System.out.println("end of testSubtract ");
  }
  
  // tests the method multiply() in ComplexNumber class
  public void testMultiply(){
    System.out.println("testMultiply ");
    System.out.println("Complex A: " + num1.toString());
    System.out.println("Complex B: " + num2.toString());
    num1.multiply(num2);
    System.out.println("Complex A * Complex B = " + num1.toString());
    System.out.println("end of testMultiply ");
  }
  
  //tests the method divide() in ComplexNumber class
  public void testDivide(){
    System.out.println("testDivide ");
    System.out.println("Complex A: " + num1.toString());
    System.out.println("Complex B: " + num2.toString());
    num1.divide(num2);
    System.out.println("Complex A / Complex B = " + num1.toString());
  }    
    
  
} // end ComplexNumberTest
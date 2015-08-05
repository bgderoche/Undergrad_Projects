/**
 * Rebecca Gruntz
 * Spring 2013
 * CSCI 1583
 * Assignment 2: Complex Number 
 */

class ComplexNumber{
  
  // the instance variables a and b represent the real and 
  // imaginary parts of the complex number
  private float a;  
  private float b;
  
  
  /**
   * ComplexNumber constructor creates a new complex number
   * requires two parameters, float a and float b
   */
  public ComplexNumber(float a, float b){
    this.a = a;
    this.b = b;
  }
  
  /**
   * Query that returns the value of this.a
   */
  public float getA(){
    return this.a;
  }
  
  /**
   * Query that returns the value of this.b
   */
   public float getB(){
     return this.b;
   }
   
   
   /**
    * Command to add the complex numbers
    */
    public void add(ComplexNumber otherNumber){
      this.a = this.a + otherNumber.getA();
      this.b = this.b + otherNumber.getB();
      }
    
    
    /**
     * Command to subtract the complex numbers
     */
    public void subtract(ComplexNumber otherNumber){
      this.a = this.a - otherNumber.getA();
      this.b = this.b - otherNumber.getB();
    }
    
    /**
     * Command to multiply the complex numbers
     */
     public void multiply(ComplexNumber otherNumber){
       float real = this.a * otherNumber.getA() - this.b * otherNumber.getB();
       float img = this.b * otherNumber.getA() + this.a * otherNumber.getB();
       this.a = real;
       this.b = img;
     }
     
     /**
      * Command to divide the complex numbers
      */
    public void divide(ComplexNumber otherNumber){
      float denom = (otherNumber.getA() * otherNumber.getA()) + 
                      (otherNumber.getB() * otherNumber.getB());
      float a2 = this.a * otherNumber.getA() + this.b * otherNumber.getB();
      float b2 = this.b * otherNumber.getA() - this.a * otherNumber.getB();
      this.a = a2/denom;
      this.b = b2/denom;
                                                 
    }
    
    /**
     * Return a string representation of the Complex object
     */
    public String toString(){
      if (this.b == 0){
        return this.a + "";
      }
      if (this.a == 0){
        return this.b + "i";
      }
      if (this.b < 0){
        return this.a + " - " + (-this.b) + "i";
      }
      return this.a + " + " + this.b + "i";
        
    }
    
} // end class
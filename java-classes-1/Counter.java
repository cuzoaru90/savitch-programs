/* Define a class called Counter whose objects count things. An object of this class records a count that is a
nonnegative integer. Include methods to set the counter to 0, to increase the count by 1, and to decrease the
count by 1. Be sure that no method allows the value of the counter to become negative. Include an accessor method that
returns the current count value and a method that outputs the count to the screen. There should be no input method or
other mutator methods. The only method that can set the counter is the one that sets it to zero. Also, include a
toString method and and equals method. Write a program (or programs) to test all the methods in your class definition.
 */



public class Counter {
  private int count;

  /**
   * Constructor
   */
  public Counter(){
    count = 0;
  }

  /**
   * Accessor
   * @return Value of count (int)
   */
  public int getCount(){
    return count;
  }

  /**
   * Displays count to the console
   */
  public void displayCount(){
    System.out.println( toString() );
  }

  /**
   * Convert count variable to String
   * @return
   */
  public String toString(){
    return " " + count;
  }

  /**
   * Resets count
   */
  public void resetCount(){
    count = 0;
  }

  /**
   * Increment count variable
   */
  public void increaseCount(){
    count++;
  }

  /**
   * Decrement count variable
   */
  public void decreaseCount(){
    if (count > 0){
      count--;
    }
  }


}

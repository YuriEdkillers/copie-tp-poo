package date.util;
import date.Date;
/** A class to enumerate the months
*
*/

public enum Month{
  janvier(31),
  fevrier(28),
  mars(31),
  avril(30),
  mai(31),
  juin(30),
  juillet(31),
  aout(31),
  septembre(30),
  octobre(31),
  novembre(30),
  decembre(31);


  /**the number of a month's days*/
  private final int nbDays ;

  /** creates a month with a number of days
  *@param nbDays the number of the month's nDaysAfter
  *@return the number of the day
  */
  private Month(int nbDays){
      this.nbDays = nbDays ;
  }



  /** returns the next month
  @return the next months
  */
  public Month next(){
    return this.values()[(this.ordinal()+1)%(this.values().length)];
  }

  /**returns the number of a month's days
  *@param year the year given in parameter
  *@return the number of days of the month if it's not February.
   Otherwise it returns 29 if the year is a leap year and 28 if it isn't
  */
  public int nbDays(int year){
    if ((this == Month.fevrier) && Date.isLeapYear(year)) return this.nbDays+1;
    return this.nbDays;
  }
}

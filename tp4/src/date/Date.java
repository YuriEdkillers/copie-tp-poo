package date;
import date.util.*;
/**
 * The date of a given day
 *
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */

public class Date {
    /**
     * creates a Date
     */

    /**
     * The day of the Date
     */
    private int day ;

    /**
     * The month of the Date
     */
    private Month month;

    /**
     * The year of the Date
     */
    private int year;

    /** creates a Date
     *@param days the number of the day
     *@param month the number of the month
     *@param years the number of the year
     */
    public Date(int day, Month month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
    }

    /**
     * returns the day of the Date
     *@return  the day of the Date
     */
    public int getDay(){
	return this.day ;
    }

    /**
     * returns the month of the Date
     *@return  the month of the Date
     */
    public Month getMonth(){
	return this.month;
    }

    /**
     * returns the year of the Date
     *@return  the year of the Date
     */
    public int getYear(){
	return this.year;
    }

    /**Return a boolean true if a date is before another
     *@param date a date
     *@return boolean true if the date is before the target date
     */
    public boolean isBefore(Date date){
	if (this.year< date.year) return true;
	else if (this.year == date.year){
	    if (this.month.ordinal()<date.month.ordinal()) return true;
	    else if (this.month.ordinal() == date.month.ordinal()){
		if (this.day < date.day) return true;
	    }
	}
	return false;
    }

    /**Return a boolean true if a date is after another
     *@param date a date
     *@return boolean true if the date is after the target date
     */
    public boolean isAfter(Date date){
	if (this.year> date.year) return true;
	else if (this.year == date.year){
	    if (this.month.ordinal()>date.month.ordinal()) return true;
	    else if (this.month.ordinal() == date.month.ordinal()){
		if (this.day > date.day) return true;
	    }
	}
	return false;
    }

    public int compare(Date d) {
	int diffd = this.day - d.getDay();
	int diffm = (this.month.ordinal() - d.month.ordinal())*100;
	int diffy = (this.year - d.getYear())*10000;
	int comp = diffd+diffm+diffy;
	return comp;
    }


    /**gives the number of days between two Date
     *@param d a date
     *@return int number of days between the two dates
     */
    public int nbDaysBetween(Date d){
	Date thisdate = new Date(this.day, this.month, this.year);
	int comp = thisdate.compare(d);
	int negative = 1;
	int diff = 0;
	if (comp<0) {
	    comp = -comp;
	    negative = -1;
	}
	while(comp != 0) {
	    thisdate = thisdate.tomorrow();
	    diff++;
	    comp = thisdate.compare(d)*negative;
	}
	return diff*negative;
    }


    /**
     * return the next day of the current date
     *@return the date of the next day
     */
    public Date tomorrow(){
	if (this.day == this.month.getNbDays(this.year)) {
	    if(this.month == Month.december) {
		return new Date(1, Month.january, this.year + 1);
	    }
	    else {
		return new Date(1, this.month.next(), this.year);
	    }
	}
	else {
	    return new Date(this.day + 1, this.month, this.year);
	}
    }


    public Date nbDaysAfter(int nbDays){
	/*if (nbDays < 0) Throw new IllegalArgumetException("argument should be +");*/
	Date d = this;
	for (int i =0;i<nbDays;i++){
	    d = d.tomorrow();
	}
	return d;
    }

    /**returns if the year is a leap year or not
     *@param year a year given
     *@return true or false.
     *<code>true</code> if the year is a leap year
     *<code>false</code> if the year is not a leap year
     */
    public static boolean isLeapYear(int year){
	return (year%4==0 && year%100!=0);
    }

    /**
     * test if two dates are equals
     *@return  a boolean True if it's equal, False if not
     */

    public boolean equals(Object O){
	if(O instanceof Date){
	    Date other = (Date)O ;
	    return this.day == other.day && this.month==other.month && this.year == other.year ;
	}
	return false;
    }

    /**
     * print the date to a string
     *@return  the string format of the current date
     */
    public String toString() {
	return "The date is : "+this.day+"/"+this.month+"/"+this.year;
    }

}

package date;
import date.util.*;
import date.*;

 /*
  * main de Date
  * @author Kril Edouard  Wiels Arthur
  */

public class DateMain {
    public static void main(String[] args) {
	Date d1 = new Date(26, Month.february, 2019);
	Date d2 = new Date(20, Month.september, 2019);
	System.out.println(d1.equals(d2));
	System.out.println(d1.compare(d2));
	System.out.println(d1.dateAfternDays(200));
	System.out.println(d1.differenceInDays(d2));
	System.out.println(d1.tomorrow());
	System.out.println(d2.toString());
    }
}


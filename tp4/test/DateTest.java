import org.junit.*;
import static org.junit.Assert.*;

import date.util.*;
import date.*;

public class DateTest{

    @Test
    public void testDateCreation(){
	Date d = new Date(01, Month.avril, 2020);
	assertNotNull(d);
	assertEquals(01, d.getDay());
	assertEquals(Month.avril, d.getMonth());
	assertEquals(2020, d.getYear());
    }

    @Test
    public void testIsBefore(){
	Date d1 = new Date(01,Month.avril,2020);
	Date d2 = new Date(02,Month.avril,2020);
	Date d3 = new Date(01,Month.mai,2020);
	Date d4 = new Date(01,Month.avril,2021);
	assertTrue(d1.isBefore(d2));
	assertTrue(d1.isBefore(d3));
	assertTrue(d1.isBefore(d4));
    }

    @Test
    public void testIsAfter(){
	Date d1 = new Date(02,Month.avril,2020);
	Date d2 = new Date(01,Month.avril,2020);
	Date d3 = new Date(01,Month.mars,2020);
	Date d4 = new Date(01,Month.avril,2019);
	assertTrue(d1.isAfter(d2));
	assertTrue(d1.isAfter(d3));
	assertTrue(d1.isAfter(d4));
    }
         
    @Test
    public void testAreEquals(){
	Date d1 = new Date(01,Month.avril,2020);
	Date d2 = new Date(01,Month.avril,2020);
	Date d3 = new Date(04,Month.juillet,2020);
	assertEquals(true,d1.equals(d2));
	assertEquals(false,d1.equals(d3));
    }

    @Test
    public void testnbDaysAfter(){
	Date d1 = new Date(01,Month.avril,2020);
	Date d2 = new Date(04,Month.avril,2020);
	assertEquals(d2,d1.nbDaysAfter(3));
    }

    @Test
    public void testTomorrow(){
	Date d1 = new Date(24,Month.juillet,2005);
	Date d2 = new Date(25,Month.juillet,2005);
	assertEquals(d2,d1.tomorrow());
    }

    @Test
    public void testTomorrowYear(){
	Date d1 = new Date(31,Month.decembre,1978);
	Date d2= new Date(1,Month.janvier,1979);
	assertEquals(d2,d1.tomorrow());
    }

    @Test
    public void tomorrowTestMonth(){
	Date d1 = new Date(30,Month.novembre,2015);
	Date d2= new Date(1,Month.decembre,2015);
	assertEquals(d2,d1.tomorrow());

    }

    @Test
    public void testnbDaysBetween(){
	Date d1 = new Date(10,Month.aout,2015);
	Date d2 = new Date(22,Month.aout,2015);
	int i = 12;
	assertEquals(i,d1.nbDaysBetween(d2));

    }

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DateTest.class);
    }
}

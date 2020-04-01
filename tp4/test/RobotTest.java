import org.junit.*;
import static org.junit.Assert.*;

import example.Robot;
import example.util.Box;
import example.util.ConveyerBelt;

public class RobotTest{

    @Test
    public void testRobotCreation() {
	Robot R = new Robot();
	assertNull(R.getCarriedBox());
    }
    
    @Test
    public void testTake() {
	Robot R = new Robot();
	Box B = new Box(10);
	Box B2 = new Box(20);
	R.take(B);
	assertEquals(B, R.getCarriedBox());
	R.take(B2);
	assertEquals(B, R.getCarriedBox());
    }

    @Test
    public void testCarryBox() {
	Robot R = new Robot();
	Box B = new Box(10);
	assertFalse(R.carryBox());
	R.take(B);
	assertTrue(R.carryBox());
    }

    @Test
    public void testPutOn() {
	Robot R = new Robot();
	Box B = new Box(10);
	Box B2 = new Box(10);
	Box B4 = new Box(10);
	Box B3 = new Box(20);
	ConveyerBelt C = new ConveyerBelt(10);
	ConveyerBelt C2 = new ConveyerBelt(20);
	assertEquals("no box", R.putOn(C));
	R.take(B);
	assertEquals("ok", R.putOn(C));
	R.take(B3);
	assertEquals("box too heavy", R.putOn(C));
	R.putOn(C2);
	R.take(B2);
	R.putOn(C);
	R.take(B4);
	assertEquals("belt full", R.putOn(C));
    }

    public static junit.framework.Test suite() {
    	return new junit.framework.JUnit4TestAdapter(RobotTest.class);
    }
}

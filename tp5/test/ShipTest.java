import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
public class ShipTest {

	@Test
	public void testShipCreation(){
		Ship titanic = new Ship(5);
		assertNotNull(titanic);
		assertEquals(5, titanic.getLifePoints());
	}

	@Test
	public void testLifePointsDecreaseAfterHit(){
		Ship titanic = new Ship(4);
		assertEquals(4, titanic.getLifePoints());
		titanic.hit();
		assertEquals(3, titanic.getLifePoints());
	}

	@Test
	public void testShipIsSunkOrNot(){
		Ship titanic = new Ship(1);
		assertEquals(false, titanic.hasBeenSunk());
		titanic.hit();
		assertEquals(true, titanic.hasBeenSunk());
	}

	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(ShipTest.class);
	}
}

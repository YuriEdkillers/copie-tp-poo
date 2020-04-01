import org.junit.*;
import static org.junit.Assert.*;
import battleship.*;
import battleship.util.*;

public class SeaTest {

	@Test
	public void testSeaCreation(){
		Sea water = new Sea(4, 5);
		assertNotNull(water);
		assertEquals(4, water.getWidth());
		assertEquals(5, water.getHeight());
		assertEquals(0, water.getLife());
	}

	@Test
	public void testAddShipVertically(){
		Sea sea = new Sea(3,3);
		Ship ship = new Ship(2);
		Position p = new Position(0,0);
		Position p1 = new Position(0,1);
		sea.addShipVertically(ship, p);
		sea.shoot(p);
		assertEquals(1, ship.getLifePoints());
		sea.shoot(p1);
		assertEquals(0, ship.getLifePoints());
	}

	@Test
	public void testAddShipHorizontally(){
		Sea sea = new Sea(3,3);
		Ship ship = new Ship(2);
		Position p = new Position(0,0);
		Position p1 = new Position(1,0);
		sea.addShipHorizontally(ship, p);
		sea.shoot(p);
		assertEquals(1, ship.getLifePoints());
		sea.shoot(p1);
		assertEquals(0, ship.getLifePoints());
	}

	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(SeaTest.class);
	}
}

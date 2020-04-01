import org.junit.Test;
import static org.junit.Assert.*;
import battleship.*;

public class CellTest {

	@Test
	public void testCellCreation(){
		Cell someCell = new Cell();
		assertNotNull(someCell);
		assertEquals(false, someCell.wasHit());
		assertEquals(true, someCell.isEmpty());
	}

	@Test
	public void testAddShip(){
		Cell someCell = new Cell();
		assertEquals(true, someCell.isEmpty());
		Ship titanic = new Ship(5);
		someCell.addBoat(titanic);
		assertEquals(false, someCell.isEmpty());
		assertEquals(titanic, someCell.getBoat());
	}

	@Test
	public void testCellHitAndMiss(){
		Cell someCell = new Cell();
		assertEquals(false, someCell.wasHit());
		assertEquals(Answer.MISSED, someCell.hit());
		assertEquals(true, someCell.wasHit());
	}

	@Test
	public void testCellHitAndHit(){
		Cell someCell = new Cell();
		Ship titanic = new Ship(5);
		someCell.addBoat(titanic);
		assertEquals(false, someCell.wasHit());
		assertEquals(Answer.HIT, someCell.hit());
		assertEquals(true, someCell.wasHit());
		assertEquals(4, titanic.getLifePoints());
	}

	@Test
	public void testCellHitAndSunk(){
		Cell someCell = new Cell();
		Ship titanic = new Ship(1);
		someCell.addBoat(titanic);
		assertEquals(false, someCell.wasHit());
		assertEquals(Answer.SUNK, someCell.hit());
		assertEquals(0, titanic.getLifePoints());
	}

	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(CellTest.class);
	}
}

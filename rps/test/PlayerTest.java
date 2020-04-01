import org.junit.Test;
import static org.junit.Assert.*;
import rps.*;

public class PlayerTest{

  @Test
  public void testPlayerCreation(){
    Player j1 = new Player("arthur");
    assertEquals("arthur", j1.getName());
    assertEquals(0, j1.getScore());
  }

  @Test
  public void testAddScore(){
    Player j1 = new Player("arthur");
    assertEquals(0, j1.getScore());
    j1.addScore(1);
    assertEquals(1, j1.getScore());
  }
}

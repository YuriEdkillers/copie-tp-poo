import org.junit.Test;
import static org.junit.Assert.*;
import rps.*;
import rps.strategy.*;

public class GameTest{

  @Test
  public void testPlayOneRound(){
    Player j1 = new Player("arthur", new ScissorsStrat());
    Player j2 = new Player("edouard", new PaperStrat());
    Game a = new Game(j1, j2);
    a.playOneRound();
    assertEquals(2, j1.getScore());
    assertEquals(0, j2.getScore());
  }


  @Test
  public void testPlay(){
    Player j1 = new Player("arthur", new ScissorsStrat());
    Player j2 = new Player("edouard", new PaperStrat());
    Game a = new Game(j1, j2);
    assertEquals("arthur", a.play(4));
  }


}

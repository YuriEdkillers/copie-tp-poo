package battleship;
import battleship.util.*;

/** 
 * create a game of battleship and plays it
 */
public class battleshipMain {
  
    public static void main(String[] args) {
	Sea s1 = new Sea(5,5);
	Ship b1 = new Ship(2);
	Ship b2 = new Ship(3);
	Ship b3 = new Ship(4);	//*spoiler* le plateau ressemblera à :
	Position p1 = new Position(3,1);	//~~*~~
	Position p2 = new Position(2,0);	//~~***
	Position p3 = new Position(1,3);	//~~*~~
	s1.addShipHorizontally(b1, p1);		//~****
	s1.addShipVertically(b2, p2);		//~~~~~
	s1.addShipHorizontally(b3, p3);
	Game g1 = new Game(s1);
	g1.jeu();
    }
}

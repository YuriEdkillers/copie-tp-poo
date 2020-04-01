package battleship;

import io.*;
import battleship.util.*;

/**
 * create a game of battleship
 * 
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */
public class Game {
    private Sea sea;

    /** create a game of battleship
     * @param sea the sea to use to create a game 
     */
    public Game(Sea sea) {
	this.sea = sea;
    }

    /** 
     *play one turn of the game 
     */
    public void oneTurn() {
        System.out.println("Entrez les coordonnées à frapper :");
        System.out.println("Entrez x:");
	try {
            int x = Input.readInt();
            System.out.println("Entrez y:");
            int y = Input.readInt();
	    Position p = new Position(x,y);
	    try {
		sea.shoot(p);
	    }
	    catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("arrête");
	    }
	}
	catch (java.io.IOException e) {
            System.out.println("stop");
	}
        System.out.println();
	sea.display(false);
    }

    /**
     * play a game of battleship
     */
    public void jeu() {
	sea.display(false);
	while(this.sea.getLife() > 0) {
	    oneTurn();
	}
    }
}


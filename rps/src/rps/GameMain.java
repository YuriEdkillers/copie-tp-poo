package rps;

import rps.strategy.*;

/** Creates a game of rock paper scissors, with one human player and another using the random strategy.
 */
public class GameMain{
    public static void main(String[] args){
	Player p1 = new Player("Edouard", new HumanStrat());
	Player p2 = new Player("Arthur");
	Game g = new Game(p1, p2);
	g.play(5);
    }
}

package rps;

import rps.strategy.*;
import java.lang.Math.*;

public class Game{

    private Player p1;
    private Player p2;
    private final static int W_POINTS = 2;
    private final static int E_POINTS = 1;

    /** Creates a Game with the 2 players provided.
     * @param p1 the first player
     * @param p2 the second player
     */
    public Game(Player p1, Player p2){
	this.p1 = p1;
	this.p2 = p2;
    }

    /** Play nbRounds of RPS and return the winner
     * @param nbRounds the number of rounds to play
     * @return the winner after nbRounds rounds
     */
    public Player play(int nbRounds){
	for (int i = 0; i<nbRounds; i++){
	    playOneRound();
	}
	int a = Math.max(p1.getScore(), p2.getScore());
	if (a == p1.getScore()){
	    System.out.println(p1+" remporte la victoire !");
	    return p1;
	}
	System.out.println(p2+" remporte la victoire !");
	return p2;
    }

    /** Play one round of RPS and give the points to the winner
     */
    public void playOneRound(){
	Shape s1 = this.p1.play();
	System.out.println(p1.getName()+" a joue "+s1);
	Shape s2 = this.p2.play();
	System.out.println(p2.getName()+" a joue "+s2);
	int r = s1.compare(s2);

	if(r<0){
	    System.out.println(p2.getName()+" a gagne le round !");
	    this.p2.addScore(W_POINTS);
	}
	else if (r>0){
	    System.out.println(p1.getName()+" a gagne le round !");
	    this.p1.addScore(W_POINTS);
	}
	else {
	    System.out.println("egalite ...");
	    this.p1.addScore(E_POINTS);
	    this.p2.addScore(E_POINTS);
	}
    }
}

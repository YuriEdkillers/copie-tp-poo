package rps;

import rps.strategy.*;

public class Player{

    private String name;
    private int score;
    private Strategy strat;

    /** Creates a player using the random strat.
     * @param name the name of the player
     */
    public Player(String name){
	this.name = name;
	this.score = 0;
	this.strat = new RandomStrat();
    }

    /** Creates a player and assign a specific strat.
     * @param name the name of the player
     * @param strat the strat used by the player
     */
    public Player(String name, Strategy strat){
	this.name = name;
	this.score = 0;
	this.strat = strat;
    }

    /** returns a shape according to the current strat of the player.
     * @return a shape
     */
    public Shape play(){
	return strat.getShape();
    }

    /** returns the score of the player.
     * @return the score of the player
     */
    public int getScore(){
	return this.score;
    }

    /** returns the name of the player.
     * @return the name of the player
     */
    public String getName(){
	return this.name;
    }

    /** add n to the current score of the player.
     * @param n the points added to the score
     */
    public void addScore(int n){
	this.score = score + n;
    }

    /** returns the string representing the player.
     * @return the name of the player
     */
    public String toString(){
	return this.name;
    }
}

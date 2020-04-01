package rps;

import java.util.Random;

/** this class contains all the possible shape for the game of rock paper scissors.
 */
public enum Shape{
    PAPER,
    ROCK,
    SCISSORS;

    private static Random alea = new Random();


    /** Compare the Shapes and return a positive integer if this wins, a negative if s wins, and 0 if they're equal.
     * @param s a shape to compare to this.
     * @return an integer 
     */
    public int compare(Shape s){
	if (this == Shape.PAPER && s == Shape.ROCK || this == Shape.ROCK && s == Shape.SCISSORS || this == Shape.SCISSORS && s == Shape.PAPER){
	    return 1;
	}
	else if(this == s){
	    return 0;
	}
	else{
	    return -1;
	}
    }

    /** returns a random Shape.
     * @return a random Shape.
     */
    public static Shape random(){
	return Shape.values()[alea.nextInt(Shape.values().length)];
    }
}

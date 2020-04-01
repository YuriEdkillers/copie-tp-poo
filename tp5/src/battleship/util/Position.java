package battleship.util;

/**
 * A position in the battleship game
 * 
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */
public class Position{
    private int x;
    private int y;

    /** create a position to be use in the battleship game
     * @param x a position in the witdth of the boardgame
     * @param y a position in the height of the boardgame
     */
    public Position(int x, int y){
	this.x = x;
	this.y = y;
    }

    /** return the X of the position 
     * @return the X of the position 
     */
    public int getX(){
	return this.x;
    }

    /** return the Y of the position 
     * @return the Y of the position 
     */
    public int getY(){
	return this.y;
    }

    /** return True if two position are equals 
     * @param o the position to test
     * @return True if two position are equals 
     */
    public boolean equals(Position o){
	return this.x == o.getX() && this.y == o.getY();
    }

    /** return a string to symbolize a postion
     * @return a string to symbolize a position 
     */
    public String toString(){
	return this.x+" "+this.y;
    }
}
    

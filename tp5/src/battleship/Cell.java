package battleship;

/**
 * A cell to create the boardgame
 * 
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */
public class Cell{

    private static final char EMPTY = '.';
    private static final char MISSED = '~';
    private static final char HIT = '*';

    private boolean wasHit;
    private Ship boat;
    
    /** 
     * create a cell
     */
    public Cell(){
	this.wasHit = false;
	this.boat = null;
    }
    
    /** return a boolean to know if the cell is empty
     * @return True if the cell is empty
     */
    public boolean isEmpty(){
	return this.boat == null;
    }

    /** return a boolean to know if the cell has been hit
     * @return True if the cell had been hit
     */
    public Boolean wasHit(){
	return this.wasHit;
    }

    /** return the boat on the cell 
     * @return the boat who is position on the cell or null if the cell is empty
     */
    public Ship getBoat(){
	return this.boat;
    }
    
    /** add a boat on the cell
     * @param ship the ship to add on the cell
     */
    public void addBoat(Ship ship){
	if(this.boat == null){
	    this.boat = ship;
	}
    }

    /** hit the cell and return the result oof the shot
     * @return the result of the shot
     */
    public Answer hit(){
	if(this.isEmpty() == true){
	    this.wasHit = true;
	    return Answer.MISSED;
	}
	else{
	    this.getBoat().hit();
	    this.wasHit = true;
	    if(this.getBoat().getLifePoints() == 0){
		return Answer.SUNK;
	    }
	    else{
		return Answer.HIT;
	    }
	}
    }

    /** return a character to know if the cell has been shot and the result of the shot
     * @param defender a boolean to know if you are defender or assailant
     * @return a character corresponding to the state of the cell
     */
    public char getCharacter(boolean defender){
	if (defender){
	    ;
	}
	else{
	    if(this.wasHit()){
		if(this.isEmpty()){
		    return Cell.MISSED;
		}
		else
		    return Cell.HIT;
	    }
	    else
		return Cell.EMPTY;
	}
	return 'a';
    }
}

    

    
	    
	
    

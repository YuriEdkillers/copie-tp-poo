package battleship;

/**
 * A ship 
 * 
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */
public class Ship{
    private int lifePoints;
    
    /** create a sea
     * @param l the life point of the ship
     */
    public Ship(int l){
	this.lifePoints = l;
    }

    /** return the life points of the boat
     * @return the life points of the boat
     */
    public int getLifePoints(){
	return this.lifePoints;
    }

    /** return a boolean to know if the ship has been sunk
     * @return a boolean to know if the ship has been sunk
     */
    public Boolean hasBeenSunk(){
	return this.lifePoints == 0;
    }

    /** 
     *reduce the number of life points of the ship 
     */
    public void hit(){
	this.lifePoints = this.lifePoints - 1;
    }
}

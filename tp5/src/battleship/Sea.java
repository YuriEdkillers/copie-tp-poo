package battleship;

import battleship.util.*;

/**
 * A sea where you can position ship
 * 
 * @author Kril Edouard Wiels Arthur
 * @version 1.0
 */
public class Sea{

    private Cell[][] board;
    private int totalLP;
    private int width;
    private int height;
    
    /** create a sea
     * @param width the width of the sea
     * @param height the height of the sea
     */
    public Sea(int width, int height){
	this.width = width;
	this.height = height;
	this.board = new Cell[height][width];
	for(int i = 0; i < height; i++){
	    for(int j = 0; j < width; j++){
		this.board[i][j]=new Cell();
	    }
	}
    }

    /** return the height of the sea
     * @return the height of the sea
     */
    public int getHeight(){
	return this.height;
    }
    
    /** return the width of the sea
     * @return the width of the sea
     */
    public int getWidth(){
	return this.width;
    }
    
    /** a function to shot a position on the sea
     * @param p the position to shoot
     * @return the result oh the shot
     */
    public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException {
	if ((this.getWidth() <= p.getX()) || (0 > p.getX()) || (this.getHeight() <= p.getY()) || (0 > p.getY())) {
	    throw new ArrayIndexOutOfBoundsException() ;
	}
	else {
	    if (board[p.getX()][p.getY()].wasHit()) {
		return Answer.MISSED ;
	    }
	    else {
		Answer a = board[p.getX()][p.getY()].hit() ;
		if(a== Answer.HIT) {
		    this.totalLP--;
		}
		return a;
	    }
	}
    }

    /** print a display of the sea
     * @param defender a boolean to know if you are defender or assailant
     
     */
    public void display(boolean defender){
	System.out.print("  ");
	for(int i = 0; i < this.height;i++){
	    System.out.print(i+" ");
	}
	System.out.println();
	for(int i = 0; i < this.height; i++){
	    System.out.print(i+" ");
	    for(int j = 0; j < this.width;j++){
		System.out.print(this.board[j][i].getCharacter(defender)+" ");
	    }
	    System.out.println();
	}
    }

    /** add the Ship ship vertically down from position p. The number of
     *  cells is determined by the ship length.
     * @param ship the ship to add
     * @param position the position of the first (top) cell occupied by the ship
     * @throws IllegalStateException if the Ship ship can not be placed on the sea (outside of the board or some cell is not empty)
     */
    public void addShipVertically(Ship ship, Position position) throws IllegalStateException {
	int x = position.getX() ;
	int y = position.getY() ;
	int w = this.getWidth() ;
	int h = this.getHeight() ;
	int l = ship.getLifePoints() ;
	if((x < 0) || (y < 0) || (x > w) || (y > h) || (y+l > h)) {
	    throw new IllegalStateException() ;
	}
	else {
	    for(int i = 0; i<l; i++) {
		if (!(board[x][y+i].isEmpty())) throw new IllegalStateException();
	    }
	    for(int i = 0; i<l; i++) {
		board[x][y+i].addBoat(ship);
		totalLP++;
	    }
	}

    }

    /** add the Ship ship horizontally right from position p. The number of
     *  cells is determined by the ship length.
     * @param ship the ship to add
     * @param position the position of the first (left) cell occupied by the ship
     * @throws IllegalStateException if the Ship ship can not be placed on the sea (outside of the board or some cell is not empty)
     */
    public void addShipHorizontally(Ship ship, Position position) throws IllegalStateException {
	int x = position.getX() ;
	int y = position.getY() ;
	int w = this.getWidth() ;
	int h = this.getHeight() ;
	int l = ship.getLifePoints() ;
	if((x < 0) || (y < 0) || (x > w) || (y > h) || (x+l > w)) {
	    throw new IllegalStateException() ;
	}
	else {
	    for(int i = 0; i<l; i++) {
		if (!(board[x+i][y].isEmpty())) throw new IllegalStateException();
	    }
	    for(int i = 0; i<l; i++) {
		board[x+i][y].addBoat(ship);
		totalLP++;
	    }
	}
    }
    
    /** return the life points of all the boat on the sea
     * @return the total of life points on the sea
     */
    public int getLife(){
	return this.totalLP;
    }
}
    

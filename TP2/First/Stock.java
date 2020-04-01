
/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
    /** stock's quantity */
    private int quantity;
    /** a stock 
    */    
    public Stock()
    {
        this.quantity = 0;
    }
    /** a stock defined by its quantity
     * @param n this stock's quantity
     */
    public Stock(int n){
        this.quantity = n;
    }
    /** return this stock's quantity
     * @return this stock's quantity
     */
    public int getQuantity(){
        return this.quantity;
    }
    /** add n quantity to stock
     * @param n quantity to be added
     */
    public void add(int n){
        this.quantity += n;
    }
    /** remove n to the quantity, you cannot remove more than the current quantity
     * @param n the quantity to be removed
     * @return the quantity effectively removed
     */
    public int remove(int n){
        this.quantity -= n;
        if(this.quantity < 0){
            n += this.quantity;
            this.quantity = 0;
        }
        return n;
    }
    public String toString(){
        return "the stock's quantity is " + Integer.toString(this.getQuantity());
    }
}

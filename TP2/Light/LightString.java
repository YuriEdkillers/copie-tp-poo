
/**
 * Write a description of class LightString here.
 *
 * @author Kril Wiels
 * @version 05/02/2020
 */
public class LightString
{
    private int nbLight;
    private Lightbulb[] lights;

    /**
     * Constructor for objects of class LightString
     */
    public LightString(int n)
    {
        this.lights = new Lightbulb[n];
        this.nbLight = n;
        for(int i = 0; i<n; i++){
            Lightbulb l = new Lightbulb("blanche", 1);
            this.lights[i] = l;
        }
    }
    
    /**
     * return the i-th lightbulb
     * @param the lightbulb wanted 
     * @return the i-th lightbulb
     */
    public Lightbulb getLight(int i)
    {
        return this.lights[i];
    }
    
    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index.
     * @param i the number of the lightbulb to be changed (first has number 1)
     * @param theBulb the new lightbulb
     */
    public void changeLight(int i, Lightbulb theBulb)
    {
        this.lights[i] = theBulb;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void Switch()
    {
        for(int i = 0; i<this.nbLight; i++){
            this.lights[i].Switch();
        }
    }
    
    /**
     * return the power consume by the lightstring
     * @return the sum of power of all lightbulb
     */
    public int getConsumedPower()
    {
        int s = 0;
        if (this.lights[0].getState() == true){
            for(int i = 0; i< this.nbLight; i++){
                s = s + this.lights[i].getPower();
            }
        }
        return s;
    }
}

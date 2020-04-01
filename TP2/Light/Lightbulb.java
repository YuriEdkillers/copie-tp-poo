
/**
 * Write a description of class LightString here.
 *
 * @author Kril Wiels
 * @version 05/02/2020
 */
public class Lightbulb
{
    private boolean state;
    private String color;
    private int power;
    
    
    /** a lightbulb
     */
    public Lightbulb(String c, int p)
    {
        this.state = false;
        this.color = c;
        this.power = p;
    }
    
    /** turns the lightbulb on. If it is already on, do nothing
     */
    public void Switch()
    {
        this.state = !this.state;
    }
    
    /** returns the power of the lightbulb in watts.
     * @return this lightbulb's power
     */
    public int getPower()
    {
        return this.power;
    }
    
    /** returns the color of the lightbulb in words.
     * @return this lightbulb's color
     */
    public String getColor()
    {
        return this.color;
    }
    
    /** answers the question "Is it on ?"
     * @return the state of the lightbulb
     */
    public boolean getState()
    {
        return this.state;
    }
    
    /** returns a string describing the current Light
     * @return a description of the Light
     */
    public String toString()
    {
        String s;
        if (this.state) s = "allumée";
        else s = "éteinte";
        return "l'ampoule "+this.power+"W "+this.color+" est "+s+".";
    }
}



public class BikeStation {

    private Bike[] velos;
    private int capacity;
    private String name;
    private int number;
    
    /** create a new BikeStation object
     * @param name the name of the station
     * @param capacity the size of the station
     */
	public BikeStation(String name, int capacity) {
	    this.name = name;
	    this.capacity = capacity;
	    this.velos = new Bike[capacity];
	    this.number = 0;
	}

    /** return the name of the BikeStation object
     * @return the name of the BikeStation object
     */
	public String getName() {
	    return this.name;
	}

    /** return the capacity of the BikeStation object
     * @return the capacity of the BikeStation object
     */
	public int getCapacity() {
	    return this.capacity;
	}

    /** return the number of Bike objects in the BikeStation object
     * @return the number of Bike objects in the BikeStation object
     */
	public int getNumberOfBikes() {
	    return this.number;
	}

    
    /** return the first free slot in the BikeStation object
     * @return the first free slot in the BikeStation object
     */
	public int firstFreeSlot() {
	    int s, i;
	    s = 0;
	    for(i = 0; i< this.capacity; i++){
		if(this.velos[i] == null){
		    break;
		}
	    }
	    if(i == this.capacity) return -1;
	    return i;
	}
	
    /** put a Bike object in the BikeStation object if there is an empty slot
     * @param bike the Bike object to be dropped
     * @return the state of success of the operation
     */
	public boolean dropBike(Bike bike) {
	    int i;
	    i = this.firstFreeSlot();
	    if(i == -1){
		return false;
	    }
	    this.velos[i] = bike;
	    this.number++;
	    return true;
	}
	
	
	
    /** take a Bike object in the BikeStation object if there is one
     * @param i the slot of the Bike object to be taken
     * @return the Bike object in the slot i
     */
	public Bike takeBike(int i) {
	    if((i > this.capacity) || (i < 0)) return null;
	    if(velos[i] == null) return null;
	    this.number--;
	    Bike bike = velos[i];
	    velos[i] = null;
	    return bike;
	}	
}

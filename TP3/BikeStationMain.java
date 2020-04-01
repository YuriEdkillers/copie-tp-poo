public class BikeStationMain{
    public static void main(String[] args){
	BikeStation s1;
	s1 = new BikeStation("Timoleon", 10);
	Bike v1;
	Bike v2;
	v1 = new Bike("b001", BikeModel.CLASSICAL);
	v2 = new Bike("b002", BikeModel.ELECTRIC);
	s1.dropBike(v1);
	s1.dropBike(v2);
	Bike v3;
	v3 = s1.takeBike(Integer.parseInt(args[0]));
	if(v3 == null) System.out.println("No bike in this slot");
	else {
	    System.out.println(v3.getId());
	    System.out.println(v3.price());
	}
    }
}
	

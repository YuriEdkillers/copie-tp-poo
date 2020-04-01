
public class BikeMain{
    public static void main(String[] args){
	Bike v1;
	Bike v2;
	v1 = new Bike("b001", BikeModel.CLASSICAL);
	v2 = new Bike("b002", BikeModel.ELECTRIC);
	System.out.println(v1.equals(v2));
	v1.toString();
	v1.price();
    }
}

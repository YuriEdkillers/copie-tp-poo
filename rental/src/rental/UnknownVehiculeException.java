package rental;

public class UnknownVehicleException extends Exception {

   public UnknownVehicleException () {
      super();
   }

   public UnknownVehicleException (String msg) {
      super(msg);
   }
   
}

package rps.strategy ;
import io.Input ;
import rps.Shape;

public class HumanStrat implements Strategy {
    public Shape getShape() {
	System.out.println("Entrez 'p'(ierre), 'f'(euille) ou 'c'(iseaux)") ;
	String m = Input.readString() ;
	Shape a = null;
	while (a==null){
	    if (m.equals("p")) {
		a =  Shape.ROCK ;
	    }
	    else if (m.equals("f")) {
		a =  Shape.PAPER ;
	    }
	    else if (m.equals("c")) {
		a =  Shape.SCISSORS ;
	    }
	    else {
		System.out.println("REntrez 'p'(ierre), 'f'(euille) ou 'c'(iseaux)") ;
		m = Input.readString() ;
	    }
	}
	return a;
    }
}

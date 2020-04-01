package rps.strategy;

import rps.Shape;

public class PaperStrat implements Strategy{
    public Shape getShape(){
	return Shape.PAPER;
    }
}

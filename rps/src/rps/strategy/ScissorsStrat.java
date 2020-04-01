package rps.strategy;

import rps.Shape;

public class ScissorsStrat implements Strategy{
    public Shape getShape(){
	return Shape.SCISSORS;
    }
}

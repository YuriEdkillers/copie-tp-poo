package rps.strategy;

import rps.Shape;

public class RockStrat implements Strategy{
    public Shape getShape(){
	return Shape.ROCK;
    }
}

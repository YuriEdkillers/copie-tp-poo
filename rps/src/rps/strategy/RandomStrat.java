package rps.strategy;

import rps.Shape;

public class RandomStrat implements Strategy{
    public Shape getShape(){
	return Shape.random();
    }
}

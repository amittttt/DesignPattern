package strategypattern;

import strategypattern.Fly.FlyNoWay;
import strategypattern.Quack.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("Display Duck .....");
	}
	
}
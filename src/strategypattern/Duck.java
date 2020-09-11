package strategypattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// Display Method :
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuick() {
		quackBehavior.quack();
	}
	
	// Set Fly and Quack Behavior at run time :
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}

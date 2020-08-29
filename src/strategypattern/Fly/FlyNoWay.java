package strategypattern.Fly;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("Fly No way ...");
	}
}

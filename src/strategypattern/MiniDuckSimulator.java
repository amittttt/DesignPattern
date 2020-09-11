package strategypattern;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Strategy Desgin Pattern .....");
		ModelDuck model = new ModelDuck();
		model.performFly();
		model.performQuick();
		// change fly way at run time
		model.setFlyBehavior(new FlyWithWings());
		model.performFly();
	}
	
	
}
